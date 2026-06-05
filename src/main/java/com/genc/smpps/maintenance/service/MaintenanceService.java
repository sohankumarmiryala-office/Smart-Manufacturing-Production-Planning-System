package com.genc.smpps.maintenance.service;


import com.genc.smpps.maintenance.model.MaintenanceWorkOrder;
import com.genc.smpps.maintenance.repo.MaintenanceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MaintenanceService {

    @Autowired
    private MaintenanceRepo maintenanceRepo;


    public MaintenanceWorkOrder createWorkOrder(MaintenanceWorkOrder workOrder) {
        workOrder.setWorkOrderStatus("OPEN");
        return maintenanceRepo.save(workOrder);
    }

    //  Assign Technician
    public MaintenanceWorkOrder assignTechnician(int id, String technician) {
        MaintenanceWorkOrder order = maintenanceRepo.findById(id).orElse(null);
        if (order != null) {
            order.setTechnicianName(technician);
            order.setWorkOrderStatus("IN_PROGRESS");
            return maintenanceRepo.save(order);
        }
        return null;
    }

    // Issue Spare Part
    public MaintenanceWorkOrder issueSpare(int id, String sparePart) {
        MaintenanceWorkOrder order = maintenanceRepo.findById(id).orElse(null);
        if (order != null) {
            order.setSparePartUsed(sparePart);
            return maintenanceRepo.save(order);
        }
        return null;
    }

    // Close Work Order
    public MaintenanceWorkOrder closeWorkOrder(int id) {
        MaintenanceWorkOrder order = maintenanceRepo.findById(id).orElse(null);
        if (order != null) {
            order.setCompletionDate(new Date());
            order.setWorkOrderStatus("COMPLETED");
            return maintenanceRepo.save(order);
        }
        return null;
    }

    // Get All
    public List<MaintenanceWorkOrder> getAll() {
        return maintenanceRepo.findAll();
    }

    //  Get by ID
    public MaintenanceWorkOrder getById(int id) {
        return maintenanceRepo.findById(id).orElse(null);
    }
}
