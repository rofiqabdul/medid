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
@Table(name = "m_courier_discount")
public class CourierDiscount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "courier_type_id")
	private long courierTypeId;
	
	@Column(name = "value")
	private BigDecimal value;
	
	private BaseProperties baseProperties;
	
	public CourierDiscount() {
		this.baseProperties = new BaseProperties();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCourierTypeId() {
		return courierTypeId;
	}

	public void setCourierTypeId(long courierTypeId) {
		this.courierTypeId = courierTypeId;
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
