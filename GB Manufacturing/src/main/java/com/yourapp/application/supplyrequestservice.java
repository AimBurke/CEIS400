package main.java.com.yourapp.application;

import java.com.yourapp.data.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class supplyrequestservice {

    public void requestSupplies(String supplyType, int quantity) {
        String sql = "INSERT INTO supply_requests (supply_type, quantity, request_date) VALUES (?, ?, NOW())";
        
        try (Connection conn = main.java.com.yourapp.data.DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
             
            pstmt.setString(1, supplyType);
            pstmt.setInt(2, quantity);
            
            int affectedRows = pstmt.executeUpdate();
            
            if (affectedRows > 0) {
                System.out.println("Supply request submitted successfully.");
            } else {
                System.out.println("Failed to submit supply request.");
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}
