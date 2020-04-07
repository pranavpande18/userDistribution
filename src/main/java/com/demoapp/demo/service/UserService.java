package com.demoapp.demo.service;

import com.demoapp.demo.model.User;
import com.demoapp.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> displayAllUsers(){
        return  userRepository.findAll();
    }

    public Optional<User> getUserById(Integer id){
        return userRepository.findById(id);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(Integer id, User userToUpdate) {
        if(userRepository.existsById(id)){
            userRepository.save(userToUpdate);
        }

    }

    public void deleteUserById(Integer id) {
        if(userRepository.existsById(id)){
            userRepository.deleteById(id);
        }else{
            System.out.println("User with ID: " + id
                                    + " Does not exist");
        }
    }
}
