package com.genc.smpps.maintenance.repo;

import com.genc.smpps.maintenance.model.MaintenanceWorkOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaintenanceRepo extends JpaRepository<MaintenanceWorkOrder, Integer> {

}
