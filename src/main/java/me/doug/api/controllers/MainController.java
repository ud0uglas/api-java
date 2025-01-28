package me.doug.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import me.doug.api.entites.User;
import me.doug.api.repositories.UserRepository;

@Controller
@RequestMapping(path = "/")
public class MainController {

    @Autowired
    private UserRepository userRepository;


    @PostMapping(path = "/add")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
        User user = new User();

        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        return "Salvo";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }


}
