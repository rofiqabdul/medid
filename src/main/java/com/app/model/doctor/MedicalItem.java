package com.app.model.doctor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.model.BaseProperties;

@Entity
@Table(name = "m_medical_item")
public class MedicalItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "medical_item_category_id")
	private long medicalItemCategoryId;
	
	@Column(name = "composition")
	private String composition;
	
	@Column(name = "medical_item_segmentation_id")
	private long medicalItemSegmentationId;
	
	@Column(name = "manufacturer")
	private String manufacturer;
	
	@Column(name = "indication")
	private String indication;
	
	@Column(name = "dosage")
	private String dosage;
	
	@Column(name = "direction")
	private String direction;
	
	@Column(name = "contradiction")
	private String contradiction;
	
	@Column(name = "caution")
	private String Caution;
	
	@Column(name = "packaging")
	private String packaging;
	
	@Column(name = "price_max")
	private long priceMax;
	
	@Column(name = "price_min")
	private long priceMin;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "imagePath")
	private String imagePath;
	
	private BaseProperties baseProperties;
	
	public MedicalItem() {
		this.baseProperties = new BaseProperties();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMedicalItemCategoryId() {
		return medicalItemCategoryId;
	}

	public void setMedicalItemCategoryId(long medicalItemCategoryId) {
		this.medicalItemCategoryId = medicalItemCategoryId;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public long getMedicalItemSegmentationId() {
		return medicalItemSegmentationId;
	}

	public void setMedicalItemSegmentationId(long medicalItemSegmentationId) {
		this.medicalItemSegmentationId = medicalItemSegmentationId;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getIndication() {
		return indication;
	}

	public void setIndication(String indication) {
		this.indication = indication;
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

	public String getContradiction() {
		return contradiction;
	}

	public void setContradiction(String contradiction) {
		this.contradiction = contradiction;
	}

	public String getCaution() {
		return Caution;
	}

	public void setCaution(String caution) {
		Caution = caution;
	}

	public String getPackaging() {
		return packaging;
	}

	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}

	public long getPriceMax() {
		return priceMax;
	}

	public void setPriceMax(long priceMax) {
		this.priceMax = priceMax;
	}

	public long getPriceMin() {
		return priceMin;
	}

	public void setPriceMin(long priceMin) {
		this.priceMin = priceMin;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public BaseProperties getBaseProperties() {
		return baseProperties;
	}

	public void setBaseProperties(BaseProperties baseProperties) {
		this.baseProperties = baseProperties;
	}
}
