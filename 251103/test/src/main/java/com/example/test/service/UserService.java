package com.example.test.service;


import com.example.test.respository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.test.entity.User;
@Service
@RequiredArgsConstructor
public class UserService {
    public final UserRepository userRepository;

    @Transactional
    public User register(String name,int age){
        User user = User.builder().name(name).age(age).build();
        return userRepository.save(user);
    }


}
