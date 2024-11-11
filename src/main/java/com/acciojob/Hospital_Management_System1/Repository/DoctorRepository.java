package com.acciojob.Hospital_Management_System1.Repository;

import com.acciojob.Hospital_Management_System1.Models.Doctor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Slf4j
@Repository
public class DoctorRepository {
    Map<Integer, Doctor> doctorMap = new HashMap<>();

    public String addDoctorToDb(Doctor doctor){
        doctorMap.put(doctor.getDocId(), doctor);
        return "Doctor has been added to db with doctor id "+doctor.getDocId();
    }

    public List<Doctor> getAllDoctors(){
        log.info("We are in the repo Layer returning all the doctors ");
        return doctorMap.values().stream().toList();
    }
}
