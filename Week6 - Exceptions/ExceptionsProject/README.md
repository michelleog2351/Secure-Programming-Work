## Getting Started

**Download the FULL folder**

**Coding Challenge: File Processing and Data Manipulation**

This is a small Java application that processes a text file containing student names and their scores in a subject, separated by commas (e.g., "John Doe, 85"). The application should read the file, calculate the average score of all students, and write the result to a new file. Additionally, the application must handle various exceptions that may arise during the process.

# What the codes does :
**File Reading and Writing**

  Read from a file named students.txt
  
  Write the average score to a file named average_score.txt
  
**Data Processing**

  Parse each line to extract the student's score.
  
  Calculate the average score of all students.

# Requirements:

## Exception Handling
### You need to complete the rest:
  **1. Handle FileNotFoundException if the input file does not exist.**
  
  **2. Handle IOException for other IO errors.**
  
  **3. Handle NumberFormatException if the score is not a valid integer.**
  
  **4. Implement a custom exception called InvalidDataFormatException that is thrown when a line does not follow the expected format ("Name, Score").**

**Cleanup**

  **5. Ensure that all resources (e.g., file readers and writers) are properly closed, regardless of whether an exception occurs.**



