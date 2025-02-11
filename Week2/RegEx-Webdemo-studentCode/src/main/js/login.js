var attempt = 3; // Variable to count number of attempts.
// Below function Executes on click of login button.

function validate() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;

    var usernameRegEx = "FILL IN THE REG-EX" ;
    var passwordRegEx = "FILL IN THE REG-EX" ;

/*   HINT........ 
    if (usernameRegEx.test(username)) {
            // COMPLETE YOU CHECK.....
    }
*/


    if (username == "adams.apple" && password == "Password#123") {
        alert("Login successfully");
        window.location = "success.html"; // Redirecting to other page.
        return false;
    }
    else {
        attempt--;// Decrementing by one.
        alert("You have left " + attempt + " attempt;");
        // Disabling fields after 3 attempts.
        if (attempt == 0) {
            document.getElementById("username").disabled = true;
            document.getElementById("password").disabled = true;
            document.getElementById("submit").disabled = true;
            return false;
        }
    }   
}

// Below function Executes on click of emailLogin button.
function validateEmail() {
    var emailEntered = document.getElementById("email").value;
    
    var EmailRegEx = "FILL IN THE REG-EX" ;

/*   HINT........ 
    if (EmailRegEx.test(emailEntered)) {
            // COMPLETE YOU CHECK.....
    }
*/

    if (emailEntered == "student@atu.ie") {
        alert("This is a valid email address");
        window.location = "home.html"; // Redirecting to other page.
        return false;
    }
    else {
        attempt--;// Decrementing by one.
        alert("Incorrect Email, You have left " + attempt + " attempt;");
        // Disabling fields after 3 attempts.
        if (attempt == 0) {
            document.getElementById("email").disabled = true;
            document.getElementById("submit").disabled = true;
            return false;
        }
    }
}
