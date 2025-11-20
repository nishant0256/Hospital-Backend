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

import com.example.demo.model.Patient;
import com.example.demo.service.PatientService;

@RestController
@CrossOrigin
@RequestMapping("/patients")
public class PatientController {

	@Autowired
	private  PatientService service;
	
	@PostMapping
	 public Patient add(@RequestBody Patient p) {
	        return service.addPatient(p);
	    }
	
	@GetMapping
	public List<Patient> getAll() {
        return service.getAllPatients();
    }
	
	@GetMapping("/{id}")
	public Patient get(@PathVariable Long id) {
        return service.getPatient(id);
    }
	
	@PutMapping("/{id}")
	public Patient update(@PathVariable Long id, @RequestBody Patient p) {
        return service.updatePatient(id, p);
    }
	
	@DeleteMapping("/{id}")
	public void deletePatient(@PathVariable Long id) {
        service.deletePatient(id);
    }
}
