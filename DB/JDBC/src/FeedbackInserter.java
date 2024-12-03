package DB.JDBC.src;
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
            System.out.println("Connection done");
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





<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Feedback Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        .form-container {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            background-color: #f9f9f9;
        }
        .form-container input, .form-container textarea {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
        }
        .form-container button {
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }
        .form-container button:hover {
            background-color: #45a049;
        }
        .show-data-link {
            display: block;
            margin-top: 20px;
            text-align: center;
            text-decoration: none;
            color: #007bff;
        }
        .show-data-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Submit Your Feedback</h2>
        <form action="submitFeedback" method="POST">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>

            <label for="feedback">Feedback:</label>
            <textarea id="feedback" name="feedback" rows="4" required></textarea>

            <button type="submit">Submit Feedback</button>
        </form>

        <!-- Link to show stored feedback data -->
        <a href="getFeedback.jsp" class="show-data-link">Show Data</a>
    </div>
</body>
</html>
