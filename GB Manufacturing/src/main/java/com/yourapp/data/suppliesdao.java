package java.com.yourapp.data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SuppliesDao {

    public void updateSupplyQuantity(String supplyType, int quantity) {
        String sql = "UPDATE supplies SET quantity = quantity + ? WHERE supply_type = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, quantity);
            stmt.setString(2, supplyType);
            stmt.executeUpdate();

            System.out.println("Supply quantity updated successfully.");
        } catch (SQLException e) {
            System.out.println("Error updating supply quantity: " + e.getMessage());
        }
    }
}
