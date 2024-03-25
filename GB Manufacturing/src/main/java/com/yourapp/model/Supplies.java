package main.java.com.yourapp.model;

public class Supplies {
    private Long id;
    private String type;
    private int quantity;

    // Constructors
    public Supplies() {}

    public Supplies(Long id, String type, int quantity) {
        this.id = id;
        this.type = type;
        this.quantity = quantity;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
