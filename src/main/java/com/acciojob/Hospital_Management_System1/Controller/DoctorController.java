package com.acciojob.Hospital_Management_System1.Controller;

import com.acciojob.Hospital_Management_System1.Models.Doctor;
import com.acciojob.Hospital_Management_System1.Services.DoctorServiceLayer;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController //This denotes API
@RequestMapping("doctor")

public class DoctorController {
    @Autowired
    private DoctorServiceLayer doctorServiceLayerObj;

    @GetMapping("/getLogs")
    public void getLogs(){

        log.error("This is an error message");
        log.warn("This is a warning message");
        log.info("This is an information");
        log.debug("This is debug message");
        log.trace("This is a trace message");
    }

    @PostMapping("/add")
    public ResponseEntity addDoctor(@RequestBody Doctor doctor){
        log.info("We have got the request doctor {}", doctor);
        String result = doctorServiceLayerObj.addDoctor(doctor);
        return new ResponseEntity(result, HttpStatus.CREATED);
    }

    @GetMapping("/getDoc")
    public ResponseEntity getDocNameWithMaxExp(){
        log.info("We are in the getDoc Name With Max Experience ");
        String name = doctorServiceLayerObj.getDocNameWithMaxExp();

        if (name == ""){
            return new ResponseEntity(name, HttpStatus.EXPECTATION_FAILED);
        }
        return new ResponseEntity(name, HttpStatus.OK);
    }

    @GetMapping("/getDocListWithDegree")
    public List<Doctor> getDocListWithDegree(@RequestParam("degree") String degree){
        List<Doctor> doctors = doctorServiceLayerObj.getListOfDoctor(degree);
        return doctors;
    }
}
