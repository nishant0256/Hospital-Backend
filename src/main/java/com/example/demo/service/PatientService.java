package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Patient;
import com.example.demo.repository.PatientRepository;

@Service
public class PatientService {
@Autowired
private PatientRepository repo;

public List<Patient> getAllPatients() {
    return repo.findAll();
}

public Patient getPatient(Long id) {
    return repo.findById(id).orElse(null);
}

public Patient addPatient(Patient p) {
	// TODO Auto-generated method stub
	return repo.save(p);
}




public Patient updatePatient(Long id, Patient p) {
    Patient patient = repo.findById(id).orElse(null);
    if (patient != null) {
        patient.setName(p.getName());
        patient.setAge(p.getAge());
        patient.setGender(p.getGender());
        patient.setPhone(p.getPhone());
        return repo.save(patient);
    }
    return null;
}

public void deletePatient(Long id) {
    repo.deleteById(id);
}


}
