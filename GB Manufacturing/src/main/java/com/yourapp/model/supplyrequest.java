package main.java.com.yourapp.model;

public class supplyrequest {
    public enum Status {
        PENDING, FULFILLED
    }
    
    private Long id;
    private String supplyType;
    private int quantity;
    private Status status; // Using the enum here
    
    // Constructor
    public supplyrequest() {
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSupplyType() {
        return supplyType;
    }

    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // You can add other fields and their getters and setters as necessary
}
