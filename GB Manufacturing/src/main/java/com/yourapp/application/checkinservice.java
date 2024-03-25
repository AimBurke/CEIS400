package main.java.com.yourapp.application;

// Import necessary packages for database access. For example, using JDBC:
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class checkinservice {

    // Database credentials and URL
    private static final String DB_URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String USER = "your_username";
    private static final String PASS = "your_password";

    public boolean checkinEquipment(String equipmentId) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // Step 1: Establishing a Connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Step 2: Create a statement using connection object
            String updateStatusSQL = "UPDATE equipment SET status = 'Available' WHERE equipment_id = ?";
            pstmt = conn.prepareStatement(updateStatusSQL);
            pstmt.setInt(1, Integer.parseInt(equipmentId));

            // Step 3: Execute the query or update query
            int affectedRows = pstmt.executeUpdate();

            // Check if the update was successful
            return affectedRows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Return false if any SQL exceptions occur
        } finally {
            // Step 4: Try to close resources
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
