package com.app.model.medical;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.model.BaseProperties;

@Entity
@Table(name = "t_doctor_office_treatment")
public class DoctorOfficeTreatment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "doctor_treatment_id")
	private long doctorTreatmentId;
	
	@Column(name = "doctor_office_id")
	private long doctorOfficeId;
	
	private BaseProperties baseProperties;
	
	public DoctorOfficeTreatment() {
		this.baseProperties = new BaseProperties();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDoctorTreatmentId() {
		return doctorTreatmentId;
	}

	public void setDoctorTreatmentId(long doctorTreatmentId) {
		this.doctorTreatmentId = doctorTreatmentId;
	}

	public long getDoctorOfficeId() {
		return doctorOfficeId;
	}

	public void setDoctorOfficeId(long doctorOfficeId) {
		this.doctorOfficeId = doctorOfficeId;
	}

	public BaseProperties getBaseProperties() {
		return baseProperties;
	}

	public void setBaseProperties(BaseProperties baseProperties) {
		this.baseProperties = baseProperties;
	}
}
