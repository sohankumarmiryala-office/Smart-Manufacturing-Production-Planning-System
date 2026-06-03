package com.genc.smpps.quality.repo;

import com.genc.smpps.quality.model.QualityInspection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QualityInspectionRepository extends JpaRepository<QualityInspection, Long> {}
