package com.acciojob.Hospital_Management_System1.Controller;

import com.acciojob.Hospital_Management_System1.Models.Patient;
import com.acciojob.Hospital_Management_System1.Services.PatientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@Slf4j
@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;
    @PostMapping("/add")
    public String addPatient(@RequestBody Patient patient){
        return null;
    }

    @GetMapping("/addInfo")
    public Patient getPatientInfo(@RequestParam("patientId")Integer patientId){

        return null;
    }

    @GetMapping("validateAge")
    public String validateAgeForDose(@RequestParam("age")Integer age){

        try {
            String result = patientService.validateAge(age);
            return result;
        }catch (Exception e){
            log.error("Age entered is incorrect");
            return e.getMessage();
        }
    }
}
