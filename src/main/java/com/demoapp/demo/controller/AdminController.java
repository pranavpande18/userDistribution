package com.demoapp.demo.controller;

import com.demoapp.demo.ApplicationConstants;
import com.demoapp.demo.model.Doctor;
import com.demoapp.demo.model.Medical_Stores;
import com.demoapp.demo.model.Patient;
import com.demoapp.demo.model.User;
import com.demoapp.demo.service.DoctorService;
import com.demoapp.demo.service.Medical_StoresService;
import com.demoapp.demo.service.PatientService;
import com.demoapp.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AdminController {

    @Autowired
    UserService userService;

    @Autowired
    DoctorService doctorService;

    @Autowired
    PatientService patientService;

    @Autowired
    Medical_StoresService medical_storesService;

    /**
     * this method returns the json of all the users on the root screen
     * i.e.: localhost:port
     */
    @GetMapping(ApplicationConstants.GET_ALL_USERS)
    public List<User> displayAllUsers(){
        return userService.displayAllUsers();
    }

    /**
     * @param id: id Of the user to be retrieved
     */
    @GetMapping(ApplicationConstants.GET_USER_BY_ID)
    public Optional<User> getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @PostMapping(ApplicationConstants.ADD_ONE_USER)
    public void addUser(User user){
        userService.addUser(user);
    }

    @PutMapping(ApplicationConstants.UPDATE_ONE_USER)
    public void updateUser(@PathVariable Integer id, User userToUpdate){
        userService.updateUser(id, userToUpdate);
    }

    @DeleteMapping(ApplicationConstants.DELETE_ONE_USER)
    public void deleteUserById(@PathVariable Integer id){
        userService.deleteUserById(id);
    }

    //For the Doctors(MONGO DB)

    @PostMapping("/createDoctor")
    public String createDoctor(@RequestParam String name, @RequestParam String degree)
    {
        Doctor d = doctorService.createDoctor(name, degree);
        return d.toString();
    }
    @GetMapping("/retrieveDoctors")
    public List<Doctor> getAllDoctors()
    {
        return doctorService.getAllDoctors();
    }
    @DeleteMapping("/deleteDoctor")
    public String removeDoctor(@RequestParam String id)
    {
        return doctorService.deleteDoctor(id);
    }

//For the Patients(MONGO DB)

    @RequestMapping("/createPatient")
    public String createPatient(@RequestParam String name, @RequestParam String condition)
    {
        Patient p = patientService.createPatient(name, condition);
        return p.toString();
    }
    @RequestMapping("/retrievePatients")
    public String getAllPatients()
    {
        return patientService.getAllPatients().toString();
    }
    @RequestMapping("/deletePatient")
    public String removePatient(@RequestParam String id)
    {
        return patientService.deletePatient(id);
    }

    //For the Medical Stores(MONGO DB)

    @RequestMapping("/createMedicalStore")
    public String createMS(@RequestParam String name, @RequestParam String location)
    {
        Medical_Stores ms = medical_storesService.createStore(name, location);
        return ms.toString();
    }
    @RequestMapping("/retrieveMedicalStores")
    public String getAllMedical_Stores()
    {
        return medical_storesService.getAllStores().toString();
    }
    @RequestMapping("/deleteMedicalStore")
    public String removeMedical_Stores(@RequestParam String id)
    {
        return medical_storesService.removeStore(id);
    }
}
