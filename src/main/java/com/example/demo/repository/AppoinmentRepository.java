package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Appoinment;
@Repository
public interface AppoinmentRepository extends JpaRepository<Appoinment, Integer>{

}
