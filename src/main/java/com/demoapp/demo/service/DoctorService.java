package com.demoapp.demo.service;

import com.demoapp.demo.model.Doctor;
import com.demoapp.demo.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    //To create a new Doctor
    public Doctor createDoctor(String name, String degree)
    {
        return doctorRepository.save(new Doctor(name,degree));
    }

    //To retrieve all the Doctors
    public List<Doctor> getAllDoctors()
    {
        return doctorRepository.findAll();
    }

    //To delete a Doctor
    public String deleteDoctor(String id) {
        doctorRepository.deleteById(id);
        return "Successful";
    }
}
