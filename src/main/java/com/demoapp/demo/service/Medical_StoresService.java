package com.demoapp.demo.service;

import com.demoapp.demo.model.Medical_Stores;
import com.demoapp.demo.repository.Medical_StoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Medical_StoresService {

    @Autowired
    private Medical_StoresRepository medical_storesRepository;

    //To create a medical store
    public Medical_Stores createStore(String name, String location)
    {
        return medical_storesRepository.save(new Medical_Stores(name, location));
    }

    //To retrieve all stores
    public List<Medical_Stores> getAllStores()
    {
        return medical_storesRepository.findAll();
    }

    //To delete a store
    public String removeStore(String id)
    {
        medical_storesRepository.deleteById(id);
        return "Successful";
    }
}
