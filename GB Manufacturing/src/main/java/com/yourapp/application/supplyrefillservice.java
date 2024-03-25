package main.java.com.yourapp.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import main.java.com.yourapp.data.DBConnection;

public class supplyrefillservice {
    // Example method to update equipment quantity, adjust according to your actual needs
    public void refillEquipmentSupplies(String equipmentId, int quantityToAdd) {
        String updateQuery = "UPDATE equipment SET quantity = quantity + ? WHERE equipment_id = ?";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(updateQuery)) {
            
            pstmt.setInt(1, quantityToAdd);
            pstmt.setString(2, equipmentId);
            
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Equipment supplies refilled successfully.");
            } else {
                System.out.println("Failed to refill equipment supplies. Equipment ID not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error refilling equipment supplies: " + e.getMessage());
        }
    }
}
