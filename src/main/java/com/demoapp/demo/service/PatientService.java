package com.demoapp.demo.service;

import com.demoapp.demo.model.Patient;
import com.demoapp.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    //To create a Patient
    public Patient createPatient(String name, String condition)
    {
        return patientRepository.save(new Patient(name, condition));
    }

    //To retrieve all patients
    public List<Patient> getAllPatients()
    {
        return patientRepository.findAll();
    }

    //To delete a patient
    public String deletePatient(String id)
    {
        patientRepository.deleteById(id);
        return "Successful";
    }
}
