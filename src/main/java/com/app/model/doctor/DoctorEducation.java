package com.app.model.doctor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.model.BaseProperties;

@Entity
@Table(name = "m_doctor_education")
public class DoctorEducation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "doctor_id")
	private long doctorId;
	
	@Column(name = "education_level_id")
	private long educationLevelId;
	
	@Column(name = "institution_name")
	private String institutionName;
	
	@Column(name = "major")
	private String major;
	
	@Column(name = "start_year")
	private String startYear;
	
	@Column(name = "end_year")
	private String endYear;
	
	@Column(name = "is_last_education", columnDefinition = "boolean default false")
	private boolean isLastEducation;
	
	private BaseProperties baseProperties;
	
	public DoctorEducation() {
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

	public long getEducationLevelId() {
		return educationLevelId;
	}

	public void setEducationLevelId(long educationLevelId) {
		this.educationLevelId = educationLevelId;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getStartYear() {
		return startYear;
	}

	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	public String getEndYear() {
		return endYear;
	}

	public void setEndYear(String endYear) {
		this.endYear = endYear;
	}

	public boolean isLastEducation() {
		return isLastEducation;
	}

	public void setLastEducation(boolean isLastEducation) {
		this.isLastEducation = isLastEducation;
	}

	public BaseProperties getBaseProperties() {
		return baseProperties;
	}

	public void setBaseProperties(BaseProperties baseProperties) {
		this.baseProperties = baseProperties;
	}
}
