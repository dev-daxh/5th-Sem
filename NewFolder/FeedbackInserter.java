package NewFolder;

import java.sql.*;
import java.util.Scanner;

public class FeedbackInserter {

    public static void main(String[] args) {
        // Scanner to read user input from command line
        Scanner scanner = new Scanner(System.in);

        // Prompt user for name, email, and feedback
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your feedback: ");
        String feedback = scanner.nextLine();

        // Database connection details
        String dbURL = "jdbc:mysql://localhost:3306/adv_java";  // Change this to your DB URL
        String dbUsername = "root";  // Change this to your DB username
        String dbPassword = "root@123";  // Change this to your DB password

        // Insert data into the database
        try (Connection conn = DriverManager.getConnection(dbURL, dbUsername, dbPassword)) {
            // SQL Insert Statement
            String sql = "INSERT INTO feedback (name, email, feedback) VALUES (?, ?, ?)";

            try (PreparedStatement statement = conn.prepareStatement(sql)) {
                // Set values for the prepared statement
                statement.setString(1, name);
                statement.setString(2, email);
                statement.setString(3, feedback);

                // Execute the query
                int rowsInserted = statement.executeUpdate();

                // Check if the data was successfully inserted
                if (rowsInserted > 0) {
                    System.out.println("Thank you for your feedback, " + name + "!");
                } else {
                    System.out.println("Error occurred while submitting your feedback. Please try again.");
                }
            }

        } catch (SQLException e) {
            // Handle SQL exceptions
            e.printStackTrace();
            System.out.println("Error occurred while connecting to the database.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
