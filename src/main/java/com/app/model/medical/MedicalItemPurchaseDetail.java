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
@Table(name = "t_medical_item_purchase_detail")
public class MedicalItemPurchaseDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "medical_item_purchase_id")
	private long medicalItemPurchasId;
	
	@Column(name = "medical_item_id")
	private long medicalItemId;
	
	@Column(name = "quantity")
	private long quantity;
	
	@Column(name = "medical_facility_id")
	private long medicalFacilityId;
	
	@Column(name = "courir_id")
	private long courirId;
	
	@Column(name = "sub_total")
	private BigDecimal subTotal;
	
	private BaseProperties baseProperties;
	
	public MedicalItemPurchaseDetail() {
		this.baseProperties = new BaseProperties();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getMedicalItemPurchasId() {
		return medicalItemPurchasId;
	}

	public void setMedicalItemPurchasId(long medicalItemPurchasId) {
		this.medicalItemPurchasId = medicalItemPurchasId;
	}

	public long getMedicalItemId() {
		return medicalItemId;
	}

	public void setMedicalItemId(long medicalItemId) {
		this.medicalItemId = medicalItemId;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public long getMedicalFacilityId() {
		return medicalFacilityId;
	}

	public void setMedicalFacilityId(long medicalFacilityId) {
		this.medicalFacilityId = medicalFacilityId;
	}

	public long getCourirId() {
		return courirId;
	}

	public void setCourirId(long courirId) {
		this.courirId = courirId;
	}

	public BigDecimal getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	public BaseProperties getBaseProperties() {
		return baseProperties;
	}

	public void setBaseProperties(BaseProperties baseProperties) {
		this.baseProperties = baseProperties;
	}
}
