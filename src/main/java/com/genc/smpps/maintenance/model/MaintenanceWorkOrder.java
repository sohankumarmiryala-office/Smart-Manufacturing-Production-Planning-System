package com.genc.smpps.maintenance.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MaintenanceWorkOrder")
public class MaintenanceWorkOrder{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int workOrderId;

    private int machineId;

    private String maintenanceType; // PREVENTIVE, BREAKDOWN, CALIBRATION

    @Temporal(TemporalType.DATE)
    private Date scheduledDate;

    @Temporal(TemporalType.DATE)
    private Date completionDate;

    private String workOrderStatus; // OPEN, IN_PROGRESS, COMPLETED, CANCELLED

    // Extra fields (needed for your controller methods)
    private String technicianName;
    private String sparePartUsed;

    // Getters & Setters

    public int getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(int workOrderId) {
        this.workOrderId = workOrderId;
    }

    public int getMachineId() {
        return machineId;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public String getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceType(String maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    public Date getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(Date scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public Date getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }

    public String getWorkOrderStatus() {
        return workOrderStatus;
    }

    public void setWorkOrderStatus(String workOrderStatus) {
        this.workOrderStatus = workOrderStatus;
    }

    public String getTechnicianName() {
        return technicianName;
    }

    public void setTechnicianName(String technicianName) {
        this.technicianName = technicianName;
    }

    public String getSparePartUsed() {
        return sparePartUsed;
    }

    public void setSparePartUsed(String sparePartUsed) {
        this.sparePartUsed = sparePartUsed;
    }
}