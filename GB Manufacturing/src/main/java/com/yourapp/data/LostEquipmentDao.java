package java.com.yourapp.data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LostEquipmentDao {

    public void reportLostEquipment(String equipmentId) {
        String sql = "INSERT INTO lost_equipment (equipment_id) VALUES (?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, equipmentId);
            stmt.executeUpdate();

            System.out.println("Equipment reported as lost successfully.");
        } catch (SQLException e) {
            System.out.println("Error reporting lost equipment: " + e.getMessage());
        }
    }
}
