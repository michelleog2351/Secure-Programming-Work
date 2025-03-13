import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Arrays;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class PasswordEncryptionService {

    //TODO YOU NEED TO COMPLETE THIS METHOD
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException {
        //Create strings for the password and the attempted password
        String originalPassword = "Letterkenny2025"; 
        String attemptedPassword = "dog";

        byte[] salt = generateSalt();

		//encrypt the password
        byte[] encryptedPassword = getEncryptedPassword(originalPassword, salt); 

		//validate the password
        boolean isMatch = authenticate(attemptedPassword, encryptedPassword, salt);

        //Print out the password, the attempted password, the salt and whether they match or not. 
		System.out.println("Original Password: " + originalPassword);
        System.out.println("Attempted Password: " + attemptedPassword);
        System.out.println("Salt: " + Arrays.toString(salt));
        System.out.println("Passwords match: " + isMatch);
	
    }


    //TODO YOU NEED TO COMPLETE THIS METHOD
    public static byte[] generateSalt() throws NoSuchAlgorithmException {
        // VERY important to use SecureRandom instead of just Random
        
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");

        // Generate a 8 byte (64 bit) salt as recommended by RSA PKCS5
        // Create an array for salt
        byte[] salt = new byte[16];

        // get a random salt
        sr.nextBytes(salt);

        // return salt
        return salt;
    }


    //DO NOT CHANGE THIS METHOD UNLESS TO ADD PRINT STATEMENTS
    public static boolean authenticate(String attemptedPassword, byte[] encryptedPassword, byte[] salt)
            throws NoSuchAlgorithmException, InvalidKeySpecException {

        // Encrypt the clear-text password using the same salt that was used to encrypt the original password
        byte[] encryptedAttemptedPassword = getEncryptedPassword(attemptedPassword, salt);

        // Authentication succeeds if encrypted password that the user entered is equal to the stored hash
        return Arrays.equals(encryptedPassword, encryptedAttemptedPassword);
    }


    //DO NOT CHANGE THIS METHOD UNLESS TO ADD PRINT STATEMENTS
    public static byte[] getEncryptedPassword(String password, byte[] salt)
            throws NoSuchAlgorithmException, InvalidKeySpecException {

        // PBKDF2 with SHA-1 as the hashing algorithm. 
        String algorithm = "PBKDF2WithHmacSHA1";

        // SHA-1 generates 160 bit hashes, so that's what makes sense here
        int derivedKeyLength = 160;

        // Pick an iteration count that works for you. The NIST recommends at  east 1,000 iterations:
        // http://csrc.nist.gov/publications/nistpubs/800-132/nist-sp800-132.pdf
        int iterations = 20000;

        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, iterations, derivedKeyLength);

        SecretKeyFactory f = SecretKeyFactory.getInstance(algorithm);

        return f.generateSecret(spec).getEncoded();
    }

}