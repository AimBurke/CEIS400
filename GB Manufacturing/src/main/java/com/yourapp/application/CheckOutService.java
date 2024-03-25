package main.java.com.yourapp.application;

// Import necessary packages for database access
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CheckOutService {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/ceis400"; // Adjust database name accordingly
    private static final String USER = "your_username"; // Update with your actual username
    private static final String PASS = "your_password"; // Update with your actual password

    public boolean checkoutEquipment(String employeeId, String equipmentId) {
        Connection conn = null;
        PreparedStatement pstmtUpdateEquipment = null;
        PreparedStatement pstmtInsertCheckout = null;

        try {
            // Step 1: Establishing a Connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            conn.setAutoCommit(false); // Start transaction

            // Step 2: Update equipment status to 'CheckedOut'
            String updateEquipmentSQL = "UPDATE equipment SET status = 'CheckedOut' WHERE equipment_id = ?";
            pstmtUpdateEquipment = conn.prepareStatement(updateEquipmentSQL);
            pstmtUpdateEquipment.setInt(1, Integer.parseInt(equipmentId));
            int updateCount = pstmtUpdateEquipment.executeUpdate();

            // Step 3: Insert a new checkout record
            String insertCheckoutSQL = "INSERT INTO equipment_checkout (employee_id, equipment_id, checkout_date) VALUES (?, ?, CURRENT_TIMESTAMP)";
            pstmtInsertCheckout = conn.prepareStatement(insertCheckoutSQL);
            pstmtInsertCheckout.setInt(1, Integer.parseInt(employeeId));
            pstmtInsertCheckout.setInt(2, Integer.parseInt(equipmentId));
            int insertCount = pstmtInsertCheckout.executeUpdate();

            // Step 4: Commit transaction if both update and insert are successful
            if (updateCount > 0 && insertCount > 0) {
                conn.commit(); // Commit the transaction
                return true;
            } else {
                conn.rollback(); // Rollback in case of failure
                return false;
            }

        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback(); // Rollback on exception
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
            return false; // Return false if any exceptions occur
        } finally {
            // Close resources
            try {
                if (pstmtUpdateEquipment != null) pstmtUpdateEquipment.close();
                if (pstmtInsertCheckout != null) pstmtInsertCheckout.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
