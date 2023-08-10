package com.app.model.medical;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.model.BaseProperties;

@Entity
@Table(name = "t_doctor_office")
public class DoctorOffice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "doctor_id")
	private long doctorId;
	
	@Column(name = "medical_facility_id")
	private long medicalFacilityId;
	
	@Column(name = "specialization")
	private String specialization;
	
	private BaseProperties baseProperties;
	
	public DoctorOffice() {
		this.baseProperties = new BaseProperties();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}

	public long getMedicalFacilityId() {
		return medicalFacilityId;
	}

	public void setMedicalFacilityId(long medicalFacilityId) {
		this.medicalFacilityId = medicalFacilityId;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public BaseProperties getBaseProperties() {
		return baseProperties;
	}

	public void setBaseProperties(BaseProperties baseProperties) {
		this.baseProperties = baseProperties;
	}
}
