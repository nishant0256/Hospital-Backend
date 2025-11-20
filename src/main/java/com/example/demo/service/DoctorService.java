package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Doctor;
import com.example.demo.repository.DoctorRepository;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepository repo;
	
	 public List<Doctor> getAllDoctors() {
	        return repo.findAll();
	}
	 
		public Doctor getDoctor(Long id) {
			return repo.findById(id).orElse(null);
		}
		
		 public Doctor addDoctor(Doctor d) {
				// TODO Auto-generated method stub
				return repo.save(d);
			 }
	

	
	 
	 public void deleteDoctor(Long id) {
	        repo.deleteById(id);
	    }
	 public Doctor updateDoctor(Long id, Doctor d) {
		 Doctor doctor = repo.findById(id).orElse(null);
	        if (doctor != null) {
	            doctor.setName(d.getName());
	            doctor.setId(d.getId());
	            doctor.setSpecilization(d.getSpecilization());
	            doctor.setPhone(d.getPhone());
	        }
	        return null;
	 }
	
}
