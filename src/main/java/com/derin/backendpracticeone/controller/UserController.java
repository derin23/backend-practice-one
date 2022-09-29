package com.derin.backendpracticeone.controller;

import com.derin.backendpracticeone.model.User;
import com.derin.backendpracticeone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }
//    @GetMapping("/users/{id}")
//    public User getUser(@PathVariable(value = "id") Long id) {
//
//        Iterable<Integer> result = id.stream()
//                .map(Long::intValue)
//                .collect(Collectors.toList());
//        return userRepository.findAllById(result);
//    }
}
