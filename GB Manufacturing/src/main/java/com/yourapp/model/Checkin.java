package com.yourapp.model;

import java.util.Date;

public class CheckIn {
    private Long id;
    private Long checkoutId; // Links back to a specific checkout
    private Date checkinDate;
    private String conditionReport; // Description of equipment condition upon return

    // Constructors
    public CheckIn() {}

    public CheckIn(Long id, Long checkoutId, Date checkinDate, String conditionReport) {
        this.id = id;
        this.checkoutId = checkoutId;
        this.checkinDate = checkinDate;
        this.conditionReport = conditionReport;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public Long getCheckoutId() {
        return checkoutId;
    }

    public Date getCheckinDate() {
        return checkinDate;
    }

    public String getConditionReport() {
        return conditionReport;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setCheckoutId(Long checkoutId) {
        this.checkoutId = checkoutId;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public void setConditionReport(String conditionReport) {
        this.conditionReport = conditionReport;
    }
}
