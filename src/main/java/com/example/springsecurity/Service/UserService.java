package com.example.springsecurity.Service;

import com.example.springsecurity.Model.Users;
import com.example.springsecurity.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private AuthenticationManager authManager;
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
    public Users register(Users user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepo.save(user);



    }

    public String verify(Users user) {
        Authentication auth = authManager.authenticate(user);

    }
}
