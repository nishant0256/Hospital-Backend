package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Doctor;
import com.example.demo.service.DoctorService;

@RestController
@CrossOrigin
@RequestMapping("/doctors")
public class DoctorController {
	@Autowired
	private DoctorService service;
	
	@PostMapping
	 public Doctor add(@RequestBody Doctor d) {
	        return service.addDoctor(d);
	    }
	 

	@GetMapping
	public List<Doctor>getAllDoctors() {
        return service.getAllDoctors();
    }
	
	@GetMapping("/{id}")
	public Doctor getDoctor(@PathVariable Long id) {
         
        return service.getDoctor(id);
    }
	
	@PutMapping("/{id}")
	public Doctor update(@PathVariable Long id, @RequestBody Doctor d) {
        return service.updateDoctor(id, d);
    }
	
	@DeleteMapping("/{id}")
	 public  void delete(@PathVariable Long id) {
	       
	         service.deleteDoctor(id);
	    }
}
