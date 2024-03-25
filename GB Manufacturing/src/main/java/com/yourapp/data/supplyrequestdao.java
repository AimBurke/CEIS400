package main.java.com.yourapp.data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SupplyRequestDao {

    public void createSupplyRequest(String supplyType, int quantity) {
        String sql = "INSERT INTO supply_requests (supply_type, quantity) VALUES (?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, supplyType);
            stmt.setInt(2, quantity);
            stmt.executeUpdate();

            System.out.println("Supply request created successfully.");
        } catch (SQLException e) {
            System.out.println("Error creating supply request: " + e.getMessage());
        }
    }
}
