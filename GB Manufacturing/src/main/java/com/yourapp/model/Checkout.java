package main.java.com.yourapp.model;

import java.util.Date;

public class Checkout {
    private Long id;
    private Long employeeId; // Or Employee employee if using an ORM with relationships
    private Long equipmentId; // Or Equipment equipment
    private Date checkoutDate;
    private Date expectedReturnDate;

    // Constructors
    public Checkout() {}

    public Checkout(Long id, Long employeeId, Long equipmentId, Date checkoutDate, Date expectedReturnDate) {
        this.id = id;
        this.employeeId = employeeId;
        this.equipmentId = equipmentId;
        this.checkoutDate = checkoutDate;
        this.expectedReturnDate = expectedReturnDate;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public Long getEquipmentId() {
        return equipmentId;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public Date getExpectedReturnDate() {
        return expectedReturnDate;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setEmployeeId(Long employeeId) {
