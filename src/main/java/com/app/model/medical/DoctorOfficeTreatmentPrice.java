package com.app.model.medical;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.model.BaseProperties;

@Entity
@Table(name = "t_doctor_office_treatment_price")
public class DoctorOfficeTreatmentPrice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "doctor_office_treatment_id")
	private long doctorOfficeTreatmentId;
	
	@Column(name = "price")
	private BigDecimal price;
	
	@Column(name = "price_start_from")
	private BigDecimal priceStratFrom;
	
	@Column(name = "price_until_from")
	private BigDecimal priceUntilFrom;
	
	private BaseProperties baseProperties;
	
	public DoctorOfficeTreatmentPrice() {
		this.baseProperties = new BaseProperties();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDoctorOfficeTreatmentId() {
		return doctorOfficeTreatmentId;
	}

	public void setDoctorOfficeTreatmentId(long doctorOfficeTreatmentId) {
		this.doctorOfficeTreatmentId = doctorOfficeTreatmentId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getPriceStratFrom() {
		return priceStratFrom;
	}

	public void setPriceStratFrom(BigDecimal priceStratFrom) {
		this.priceStratFrom = priceStratFrom;
	}

	public BigDecimal getPriceUntilFrom() {
		return priceUntilFrom;
	}

	public void setPriceUntilFrom(BigDecimal priceUntilFrom) {
		this.priceUntilFrom = priceUntilFrom;
	}

	public BaseProperties getBaseProperties() {
		return baseProperties;
	}

	public void setBaseProperties(BaseProperties baseProperties) {
		this.baseProperties = baseProperties;
	}
}
