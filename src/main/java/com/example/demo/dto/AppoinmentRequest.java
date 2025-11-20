package com.example.demo.dto;


public class AppoinmentRequest {

	private int id;
	private long patientId;
	private long doctorId;
	private String appoinmentTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	public long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}
	public String getAppoinmentTime() {
		return appoinmentTime;
	}
	public void setAppoinmentTime(String appoinmentTime) {
		this.appoinmentTime = appoinmentTime;
	}
	
	
	
}
