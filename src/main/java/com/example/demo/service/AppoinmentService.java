package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Appoinment;
import com.example.demo.repository.AppoinmentRepository;

@Service
public class AppoinmentService {
public static final Object getAllAppointments = null;
@Autowired
private AppoinmentRepository repo;


public Appoinment addAppoinment(Appoinment a) {
	// TODO Auto-generated method stub
	return repo.save(a);
}
public Appoinment updateAppoinment(Integer id, Appoinment a) {
	// TODO Auto-generated method stub
	Appoinment existing=repo.findById(id).orElseThrow();
	
//	dont change id
	existing.setPatient(a.getPatient());
	existing.setDoctor(a.getDoctor());
	existing.setAppointmentTime(a.getAppointmentTime());
	
	return repo.save(existing);
}
public void deleteAppoinment(Integer id) {
	// TODO Auto-generated method stub
	repo.deleteById(id);
}
public Appoinment getAppoinment(Integer id) {
	// TODO Auto-generated method stub
	return repo.findById(id).orElseThrow();
}
public List<Appoinment> getAllAppointments() {
	// TODO Auto-generated method stub
	return repo.findAll();
}



}
