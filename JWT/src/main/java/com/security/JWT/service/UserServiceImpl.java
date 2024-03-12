package com.security.JWT.service;


import com.security.JWT.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.random.RandomGenerator;

@Slf4j
@Service
public class UserServiceImpl implements UserService{


    /**
     * @implNote This method is created for get all users list
     * @return List<Users>
     */
    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        try {
        users.add(new User(UUID.randomUUID().toString(),"Rudra","rudra@gmail.com","abc"));
        users.add(new User(UUID.randomUUID().toString(),"Balaji","balaji@gmail.com","dfg"));
        users.add(new User(UUID.randomUUID().toString(),"Avinash","avinash@gmail.com","hij"));
        users.add(new User(UUID.randomUUID().toString(),"Vaibhav","vaibhav@gmail.com","klm"));
        users.add(new User(UUID.randomUUID().toString(),"Abhi","abhi@gmail.com","nop"));
        }catch (Exception e){
            log.error(e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        return users;
    }
}
