package com.genc.smpps.quality.service;

import com.genc.smpps.quality.model.QualityInspection;
import com.genc.smpps.quality.repo.QualityInspectionRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QualityService {
    private final QualityInspectionRepository repo;

    public QualityService(QualityInspectionRepository repo) {
        this.repo = repo;
    }

    public List<QualityInspection> getAllInspections() {
        return repo.findAll();
    }

    public QualityInspection recordInspection(QualityInspection inspection) {
        return repo.save(inspection);
    }

    public void approveBatch(Long id) {
        QualityInspection inspection = repo.findById(id).orElseThrow();
        inspection.setInspectionResult("PASS");
        repo.save(inspection);
    }

    public void rejectBatch(Long id) {
        QualityInspection inspection = repo.findById(id).orElseThrow();
        inspection.setInspectionResult("FAIL");
        repo.save(inspection);
    }
}
