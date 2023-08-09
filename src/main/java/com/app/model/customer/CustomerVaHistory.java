package com.app.model.customer;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.model.BaseProperties;

@Entity
@Table(name = "t_customer_va_history")
public class CustomerVaHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "customer_va_id")
	private long customerVaId;
	
	@Column(name = "amount")
	private BigDecimal amount;
	
	@Column(name = "expired_on")
	private LocalDateTime expiredOn;
	
	private BaseProperties baseProperties;
	
	public CustomerVaHistory() {
		this.baseProperties = new BaseProperties();
	}

	public long getId() {
		return id;
	}

	public long getCustomerVaId() {
		return customerVaId;
	}

	public void setCustomerVaId(long customerVaId) {
		this.customerVaId = customerVaId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public LocalDateTime getExpiredOn() {
		return expiredOn;
	}

	public void setExpiredOn(LocalDateTime expiredOn) {
		this.expiredOn = expiredOn;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BaseProperties getBaseProperties() {
		return baseProperties;
	}

	public void setBaseProperties(BaseProperties baseProperties) {
		this.baseProperties = baseProperties;
	}
}
