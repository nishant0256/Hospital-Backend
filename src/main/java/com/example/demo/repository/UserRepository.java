package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Hospital_User;

public interface UserRepository extends JpaRepository<Hospital_User, Long> {

	Hospital_User findByUsername(String username);

}
