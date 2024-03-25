package main.java.com.yourapp.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import main.java.com.yourapp.data.DBConnection;


public class reportservice {

    public void generateEquipmentReport() {
        String query = "SELECT * FROM equipment";
        
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {
             
            System.out.println("Equipment Report:");
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String status = resultSet.getString("status");
                String condition = resultSet.getString("condition");
                System.out.printf("Name: %s, Status: %s, Condition: %s%n", name, status, condition);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void generateSuppliesReport() {
        String query = "SELECT * FROM supplies"; // Adjust according to your supplies table schema
        
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {
             
            System.out.println("Supplies Report:");
            while (resultSet.next()) {
                // Example fields, adjust based on your supplies table
                String item = resultSet.getString("item");
                int quantity = resultSet.getInt("quantity");
                System.out.printf("Item: %s, Quantity: %d%n", item, quantity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
