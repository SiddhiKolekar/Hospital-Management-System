package com.acciojob.Hospital_Management_System1.Services;

import com.acciojob.Hospital_Management_System1.Models.Doctor;
import com.acciojob.Hospital_Management_System1.Repository.DoctorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class DoctorServiceLayer {
    @Autowired
    private DoctorRepository repoObj;

    public String addDoctor(Doctor doctor){

        //This is where some data processing is done
        String result = repoObj.addDoctorToDb(doctor);
        return result;
    }
    public String getDocNameWithMaxExp(){
        //from repo you got the raw data
        List<Doctor> doctorList = repoObj.getAllDoctors();

        //Process on the raw from db
        int exp = 0;
        String docName = "";
        for (Doctor doctor: doctorList){

            log.debug("The doctor is {}",doctor);
            if(doctor.getExperience()==exp){
                log.trace("We are comparing level and experience ");
                if (doctor.getName().compareTo(docName)<0){
                    docName = doctor.getName();
                }
            }
            if (doctor.getExperience()>exp){
                exp = doctor.getExperience();
                docName = doctor.getName();
            }
        }
        return docName;
    }

    public  List<Doctor> getListOfDoctor(String degree){
        List<Doctor> doctorList = repoObj.getAllDoctors();
        List<Doctor> finalAnsList = new ArrayList<>();

        for(Doctor doctor:doctorList) {
            if(doctor.getDegree().equals(degree)){
                finalAnsList.add(doctor);
            }
        }
        return finalAnsList;
    }
}

