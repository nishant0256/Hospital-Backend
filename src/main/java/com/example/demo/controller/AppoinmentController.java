package com.example.demo.controller;

import java.sql.Savepoint;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AppoinmentRequest;
import com.example.demo.model.Appoinment;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.PatientRepository;
import com.example.demo.service.AppoinmentService;

@RestController
@CrossOrigin
@RequestMapping("/appointments")
public class AppoinmentController {

	@Autowired
	private AppoinmentService service;
	
	@Autowired
	private PatientRepository patientRepo;
	
	@Autowired
	private DoctorRepository doctorRepo;
	
	@GetMapping
	public ResponseEntity<List<Appoinment>> getAll(){
		return ResponseEntity.ok(service.getAllAppointments());
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Appoinment> get(@PathVariable Integer id){
		return ResponseEntity.ok(service.getAppoinment(id));
	}
	
	@PostMapping
	public ResponseEntity<Appoinment> add(@RequestBody AppoinmentRequest req){
		Appoinment a=new Appoinment();
		a.setId(req.getId());
		a.setAppointmentTime(LocalDateTime.parse(req.getAppoinmentTime()));
		a.setPatient(patientRepo.findById(req.getPatientId()).orElseThrow());
		a.setDoctor(doctorRepo.findById(req.getDoctorId()).orElseThrow());
		Appoinment saved=service.addAppoinment(a);
		return ResponseEntity.status(HttpStatus.CREATED).body(saved);
	}
	
	@PutMapping
	public ResponseEntity<Appoinment> update(@PathVariable Integer id, @RequestBody AppoinmentRequest req){
		Appoinment a=new Appoinment();
		a.setAppointmentTime(LocalDateTime.parse(req.getAppoinmentTime()));
		a.setPatient(patientRepo.findById(req.getPatientId()).orElseThrow());
		a.setDoctor(doctorRepo.findById(req.getDoctorId()).orElseThrow());
		
		Appoinment updated=service.updateAppoinment(id,a);
		return ResponseEntity.ok(updated);
	}
	
	@DeleteMapping
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		service.deleteAppoinment(id);
		return ResponseEntity.noContent().build();
	}
}
