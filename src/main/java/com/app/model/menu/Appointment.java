package com.app.model.menu;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.model.BaseProperties;

@Entity
@Table(name = "t_appointment")
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "customer_id")
	private long customerId;
	
	@Column(name = "doctor_office_id")
	private long doctorOfficeId;
	
	@Column(name = "doctor_office_schedule_id")
	private long doctorOfficeScheduleId;
	
	@Column(name = "doctor_office_treatment_id")
	private long doctorOfficeTreatmentId;
	
	@Column(name = "appointment_date")
	private LocalDateTime appointmentDate;
	
	private BaseProperties baseProperties;
	
	public Appointment() {
		this.baseProperties = new BaseProperties();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public long getDoctorOfficeId() {
		return doctorOfficeId;
	}

	public void setDoctorOfficeId(long doctorOfficeId) {
		this.doctorOfficeId = doctorOfficeId;
	}

	public long getDoctorOfficeScheduleId() {
		return doctorOfficeScheduleId;
	}

	public void setDoctorOfficeScheduleId(long doctorOfficeScheduleId) {
		this.doctorOfficeScheduleId = doctorOfficeScheduleId;
	}

	public long getDoctorOfficeTreatmentId() {
		return doctorOfficeTreatmentId;
	}

	public void setDoctorOfficeTreatmentId(long doctorOfficeTreatmentId) {
		this.doctorOfficeTreatmentId = doctorOfficeTreatmentId;
	}

	public LocalDateTime getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDateTime appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public BaseProperties getBaseProperties() {
		return baseProperties;
	}

	public void setBaseProperties(BaseProperties baseProperties) {
		this.baseProperties = baseProperties;
	}
}
