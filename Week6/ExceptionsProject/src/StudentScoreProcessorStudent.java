import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Create your own custom exception for invalid data format

public class StudentScoreProcessorStudent {

    public static void main(String[] args) {
        String inputFilePath = "students.txt";
        String outputFilePath = "average_score.txt";
        BufferedReader reader = null;
        BufferedWriter writer = null;
        int totalScore = 0;
        int validEntriesCount = 0;
        int skippedEntries = 0;

//This code will read from the students.txt file, and get the score from each student in the file.
//It should handle any bad data or errors in the file, with out crashing, and calculate the average score for students

        try {
            reader = new BufferedReader(new FileReader(inputFilePath));
            writer = new BufferedWriter(new FileWriter(outputFilePath));
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {  //read each line of the text file
                try {
                    String[] parts = currentLine.split(",");   // Splitting the line into name and score based on the comma
                    if (parts.length != 2) {
                        //If you don't have 2 parts here, you need to throw the invalid data format that you created above!
                        //throw new InvalidDataFormatException("Invalid data format: " + currentLine);
                    }
                    int score = Integer.parseInt(parts[1].trim()); // if all is ok, we can calculate the score
                    totalScore += score;
                    validEntriesCount++;
                //} catch (NumberFormatException | InvalidDataFormatException e) {
                    //catch the exception(s) here..
                } catch (......................) {
                    //catch the exception(s) here, print a valid message
                    //System.out.println("Skipping invalid entry: " + currentLine);
                    skippedEntries++; 
                }
            }

            if (validEntriesCount > 0) {  //if we have valid entries we need to calculate the average score
                double averageScore = (double) totalScore / validEntriesCount;
                writer.write("Average Score: " + averageScore);
                System.out.println("Processing completed. Average score calculated.");
                if (skippedEntries > 0) {
                    System.out.println("Skipped entries due to errors: " + skippedEntries);
                }
            } else {
                System.out.println("No valid entries found.");
            }
            //catch any issues with input ....
        } catch (...................) {
            System.out.println("TODO - PRINT AN APPROPRIATE MESSAGE");
        } finally {
            try {
                if (reader != null) reader.close();
                if (writer != null) {
                    writer.close();
                }
                 //catch any issues with closig the file resources....
            } catch (..................) {
                System.out.println("TODO - PRINT AN APPROPRIATE MESSAGE");
            }
        }
    }
}
