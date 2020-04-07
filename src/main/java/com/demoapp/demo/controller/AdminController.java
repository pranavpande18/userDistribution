package com.demoapp.demo.controller;

import com.demoapp.demo.model.User;
import com.demoapp.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AdminController {

    @Autowired
    UserService userService;

    /**
     * this method returns the json of all the users on the root screen
     * i.e.: localhost:port
     */
    @GetMapping("/")
    public List<User> displayAllUsers(){
        return userService.displayAllUsers();
    }

    /**
     * @param id: id Of the user to be retrieved
     */
    @GetMapping("/getUser/{id}")
    public Optional<User> getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @PostMapping("/addUser")
    public void addUser(User user){
        userService.addUser(user);
    }

    @PutMapping("/updateUser/{id}")
    public void updateUser(@PathVariable Integer id, User userToUpdate){
        userService.updateUser(id, userToUpdate);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUserById(@PathVariable Integer id){
        userService.deleteUserById(id);
    }


}
