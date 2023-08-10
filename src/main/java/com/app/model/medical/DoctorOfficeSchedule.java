package com.app.model.medical;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.model.BaseProperties;

@Entity
@Table(name = "t_doctor_office_schedule")
public class DoctorOfficeSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "doctor_id")
	private long doctorId;
	
	@Column(name = "medical_facility_schedule_id")
	private long medicalFacilityScheduleId;
	
	@Column(name = "slot")
	private long slot;
	
	private BaseProperties baseProperties;
	
	public DoctorOfficeSchedule() {
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

	public long getMedicalFacilityScheduleId() {
		return medicalFacilityScheduleId;
	}

	public void setMedicalFacilityScheduleId(long medicalFacilityScheduleId) {
		this.medicalFacilityScheduleId = medicalFacilityScheduleId;
	}

	public long getSlot() {
		return slot;
	}

	public void setSlot(long slot) {
		this.slot = slot;
	}

	public BaseProperties getBaseProperties() {
		return baseProperties;
	}

	public void setBaseProperties(BaseProperties baseProperties) {
		this.baseProperties = baseProperties;
	}
}
