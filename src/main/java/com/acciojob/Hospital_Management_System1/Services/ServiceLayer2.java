package com.acciojob.Hospital_Management_System1.Services;

import com.acciojob.Hospital_Management_System1.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceLayer2 {

    @Autowired
    private DoctorRepository repoObj;
}
