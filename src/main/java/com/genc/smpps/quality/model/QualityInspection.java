package com.genc.smpps.quality.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "QualityInspection")
public class QualityInspection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer inspectionId;

    private Integer orderId;

    private LocalDate inspectionDate;

    private Integer sampleSize;

    private Integer defectCount;

    @Enumerated(EnumType.STRING)
    private InspectionResult inspectionResult;

    public enum InspectionResult {
        PASS,
        FAIL,
        REWORK
    }

    public QualityInspection() {
    }

    public QualityInspection(Integer orderId, LocalDate inspectionDate, Integer sampleSize,
                             Integer defectCount, InspectionResult inspectionResult) {
        this.orderId = orderId;
        this.inspectionDate = inspectionDate;
        this.sampleSize = sampleSize;
        this.defectCount = defectCount;
        this.inspectionResult = inspectionResult;
    }

    public Integer getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(Integer inspectionId) {
        this.inspectionId = inspectionId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public LocalDate getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(LocalDate inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public Integer getSampleSize() {
        return sampleSize;
    }

    public void setSampleSize(Integer sampleSize) {
        this.sampleSize = sampleSize;
    }

    public Integer getDefectCount() {
        return defectCount;
    }

    public void setDefectCount(Integer defectCount) {
        this.defectCount = defectCount;
    }

    public InspectionResult getInspectionResult() {
        return inspectionResult;
    }

    public void setInspectionResult(InspectionResult inspectionResult) {
        this.inspectionResult = inspectionResult;
    }
}