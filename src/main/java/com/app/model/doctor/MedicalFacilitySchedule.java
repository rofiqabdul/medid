package com.app.model.doctor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.model.BaseProperties;

@Entity
@Table(name = "medical_facility_schedule")
public class MedicalFacilitySchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "medical_facility_id")
	private long medicalFacilityId;
	
	@Column(name = "day")
	private String day;
	
	@Column(name = "time_schedule_start")
	private String timeScheduleStart;
	
	@Column(name = "time_schedule_end")
	private String timeScheduleEnd;
	
	private BaseProperties baseProperties;
	
	public MedicalFacilitySchedule() {
		this.baseProperties = new BaseProperties();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getMedicalFacilityId() {
		return medicalFacilityId;
	}

	public void setMedicalFacilityId(long medicalFacilityId) {
		this.medicalFacilityId = medicalFacilityId;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTimeScheduleStart() {
		return timeScheduleStart;
	}

	public void setTimeScheduleStart(String timeScheduleStart) {
		this.timeScheduleStart = timeScheduleStart;
	}

	public String getTimeScheduleEnd() {
		return timeScheduleEnd;
	}

	public void setTimeScheduleEnd(String timeScheduleEnd) {
		this.timeScheduleEnd = timeScheduleEnd;
	}

	public BaseProperties getBaseProperties() {
		return baseProperties;
	}

	public void setBaseProperties(BaseProperties baseProperties) {
		this.baseProperties = baseProperties;
	}
}
