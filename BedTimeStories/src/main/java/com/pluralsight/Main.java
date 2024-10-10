package com.pluralsight;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the story name
        System.out.println("Enter the name of the story (without .txt): ");
        String storyName = scanner.nextLine().trim(); // Get user input

        // Create the file path
        String filePath = storyName + ".txt"; // Add .txt extension

        // Try to open and read the file
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            Scanner fileScanner = new Scanner(fileInputStream);

            int lineNumber = 1; // Start line numbers from 1

            // Read each line and print it with its line number
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(lineNumber + ": " + line); // Print line number and line
                lineNumber++; // Increment line number
            }

            // Close the file scanner
            fileScanner.close();
            fileInputStream.close(); // Close file input stream

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage()); // Show error message
        }

        // Close the user input scanner
        scanner.close();
    }
}