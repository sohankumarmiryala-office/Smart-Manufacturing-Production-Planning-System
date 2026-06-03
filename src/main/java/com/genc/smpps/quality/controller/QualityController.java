package com.genc.smpps.quality.controller;

import com.genc.smpps.quality.model.QualityInspection;
import com.genc.smpps.quality.service.QualityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/quality")
public class QualityController {
    private final QualityService service;

    public QualityController(QualityService service) {
        this.service = service;
    }

    @GetMapping("/inspections")
    public String listInspections(Model model) {
        model.addAttribute("inspections", service.getAllInspections());
        return "inspections";
    }

    @PostMapping("/record")
    public String recordInspection(@ModelAttribute QualityInspection inspection) {
        service.recordInspection(inspection);
        return "redirect:/quality/inspections";
    }

    @PostMapping("/approve/{id}")
    public String approveBatch(@PathVariable Long id) {
        service.approveBatch(id);
        return "redirect:/quality/inspections";
    }

    @PostMapping("/reject/{id}")
    public String rejectBatch(@PathVariable Long id) {
        service.rejectBatch(id);
        return "redirect:/quality/inspections";
    }
}
