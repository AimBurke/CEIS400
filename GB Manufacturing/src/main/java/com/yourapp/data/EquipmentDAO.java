package main.java.com.yourapp.data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EquipmentDAO {
    public Equipment getAvailableEquipment() {
        Equipment equipment = null;
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "SELECT * FROM equipment WHERE available = TRUE LIMIT 1";
            try (PreparedStatement ps = conn.prepareStatement(query)) {
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    equipment = new Equipment();
                    equipment.setId(rs.getInt("id"));
                    equipment.setName(rs.getString("name"));
                    equipment.setAvailable(rs.getBoolean("available"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return equipment;
    }

    public boolean checkoutEquipment(int employeeId, int equipmentId) {
        try (Connection conn = DatabaseUtil.getConnection()) {
            // Mark the equipment as not available
            String updateEquipment = "UPDATE equipment SET available = FALSE WHERE id = ?";
            try (PreparedStatement ps = conn.prepareStatement(updateEquipment)) {
                ps.setInt(1, equipmentId);
                int updated = ps.executeUpdate();
                if (updated == 1) {
                    // Record the checkout
                    String insertCheckout = "INSERT INTO checkouts (employee_id, equipment_id, checkout_date) VALUES (?, ?, NOW())";
                    try (PreparedStatement psCheckout = conn.prepareStatement(insertCheckout)) {
                        psCheckout.setInt(1, employeeId);
                        psCheckout.setInt(2, equipmentId);
                        psCheckout.executeUpdate();
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
