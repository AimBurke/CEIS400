package main.java.com.yourapp.application;

import main.java.com.yourapp.data.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class terminationservice {

    public boolean terminateEmployee(String employeeId) {
        String sql = "UPDATE employees SET status = ?, termination_date = NOW() WHERE employee_id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, "terminated");
            pstmt.setString(2, employeeId);

            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("Employee termination processed successfully.");
                return true;
            } else {
                System.out.println("Failed to process employee termination.");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
            return false;
        }
    }
}
