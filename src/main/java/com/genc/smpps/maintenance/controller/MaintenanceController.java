package com.genc.smpps.maintenance.controller;

import com.genc.smpps.maintenance.model.MaintenanceWorkOrder;
import com.genc.smpps.maintenance.service.MaintenanceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/maintenance")
public class MaintenanceController {

    @Autowired
    private MaintenanceService service;

    //  createWorkOrder()
    @PostMapping("/create")
    public MaintenanceWorkOrder createWorkOrder(@RequestBody MaintenanceWorkOrder workOrder) {
        return service.createWorkOrder(workOrder);
    }

    //  assignTechnician()
    @PutMapping("/assign/{id}")
    public MaintenanceWorkOrder assignTechnician(@PathVariable int id,
                                                 @RequestParam String technician) {
        return service.assignTechnician(id, technician);
    }

    // issueSpare()
    @PutMapping("/spare/{id}")
    public MaintenanceWorkOrder issueSpare(@PathVariable int id,
                                           @RequestParam String spare) {
        return service.issueSpare(id, spare);
    }

    // closeWorkOrder()
    @PutMapping("/close/{id}")
    public MaintenanceWorkOrder closeWorkOrder(@PathVariable int id) {
        return service.closeWorkOrder(id);
    }

    //  Get All
    @GetMapping
    public List<MaintenanceWorkOrder> getAll() {
        return service.getAll();
    }

    //  Get by ID
    @GetMapping("/{id}")
    public MaintenanceWorkOrder getById(@PathVariable int id) {
        return service.getById(id);
    }
}

