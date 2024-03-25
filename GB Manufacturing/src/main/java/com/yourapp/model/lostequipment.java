package main.java.com.yourapp.model;

import java.util.Date;

public class lostequipment {
    private Long id;
    private Long equipmentId; // Or Equipment equipment if using an ORM
    private Date reportDate;
    private String reportDetails; // Details about how it was lost, any follow-up actions, etc.

    // Constructors
    public lostequipment() {}

    public lostequipment(Long id, Long equipmentId, Date reportDate, String reportDetails) {
        this.id = id;
        this.equipmentId = equipmentId;
        this.reportDate = reportDate;
        this.reportDetails = reportDetails;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public Long getEquipmentId() {
        return equipmentId;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public String getReportDetails() {
        return reportDetails;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setEquipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public void setReportDetails(String reportDetails) {
        this.reportDetails = report
