package com.app.model.courier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.model.BaseProperties;

@Entity
@Table(name = "t_prescription")
public class Prescirption {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "appointment_id")
	private long appointmentId;
	
	@Column(name = "medical_item_id")
	private long medicalItemId;
	
	@Column(name = "dosage")
	private String dosage;
	
	@Column(name = "direction")
	private String direction;
	
	@Column(name = "time")
	private String time;
	
	@Column(name = "notes")
	private String notes;
	
	private BaseProperties baseProperties;
	
	public Prescirption() {
		this.baseProperties = new BaseProperties();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}

	public long getMedicalItemId() {
		return medicalItemId;
	}

	public void setMedicalItemId(long medicalItemId) {
		this.medicalItemId = medicalItemId;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public BaseProperties getBaseProperties() {
		return baseProperties;
	}

	public void setBaseProperties(BaseProperties baseProperties) {
		this.baseProperties = baseProperties;
	}
}
