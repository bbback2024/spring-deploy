package com.example.springdeploy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;
    @PostMapping
    public Users save(@RequestBody Users users){
        usersRepository.save(users);
        return users;
    }
    @GetMapping
    public List<Users> list(){
        return usersRepository.findAll();
    }

}
