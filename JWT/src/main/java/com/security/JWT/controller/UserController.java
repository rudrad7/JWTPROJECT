package com.security.JWT.controller;

import com.security.JWT.entity.User;
import com.security.JWT.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * @apiNote This API is created for get all users list
     * @return List<User>
     */
    @GetMapping("/getUsers")
    public List<User> getUsers(){
       return userService.getUsers();
    }


    /**
     * @apiNote This API is created for get logged-in user
     * @param principal is the interface which can have logged-in user
     * @return logged-in user name
     */
    @GetMapping("/loggedInUser")
    public String getLoggedInUserName(Principal principal){     /* Principal is the interface which can provide information about logged-in user */
       return principal.getName();
    }
}

