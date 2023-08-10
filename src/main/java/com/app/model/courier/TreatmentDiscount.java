package com.app.model.courier;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.model.BaseProperties;

@Entity
@Table(name = "t_treatment_discount")
public class TreatmentDiscount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "doctor_office_treatment_price_id")
	private long doctorOfficeTreatmentPriceId;
	
	@Column(name = "value")
	private BigDecimal value;
	
	private BaseProperties baseProperties;
	
	public TreatmentDiscount() {
		this.baseProperties = new BaseProperties();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDoctorOfficeTreatmentPriceId() {
		return doctorOfficeTreatmentPriceId;
	}

	public void setDoctorOfficeTreatmentPriceId(long doctorOfficeTreatmentPriceId) {
		this.doctorOfficeTreatmentPriceId = doctorOfficeTreatmentPriceId;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public BaseProperties getBaseProperties() {
		return baseProperties;
	}

	public void setBaseProperties(BaseProperties baseProperties) {
		this.baseProperties = baseProperties;
	}
}
