package com.kunal_debug_png.FullStack.controller;

import com.kunal_debug_png.FullStack.model.User;
import com.kunal_debug_png.FullStack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;


    @PostMapping("/users")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }


    @GetMapping("/users")
    List<User> getUsers(){
        return userRepository.findAll();
    }
}
