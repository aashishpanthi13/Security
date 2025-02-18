package com.example.springsecurity.Repo;

import com.example.springsecurity.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepo extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);

}
