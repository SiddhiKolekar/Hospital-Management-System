package com.acciojob.Hospital_Management_System1.Services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class PatientService {

    public String validateAge(int age) throws Exception{

        log.info("We have the age equals to {}", age);
        if(age<18){
            throw new Exception("Enter a valid age");
        }

        return "Age is "+age+" and is safe to give the dose";
    }
}
