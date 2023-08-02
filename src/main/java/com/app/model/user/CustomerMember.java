package com.app.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.model.BaseProperties;

@Entity
@Table(name = "m_customer_member")
public class CustomerMember {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "parent_biodata_id")
	private long parentBiodataId;
	
	@Column(name = "customer_id")
	private long customerId;
	
	@Column(name = "customer_relation_id")
	private long customerRelationId;
	
	private BaseProperties baseProperties;
	
	public CustomerMember() {
		this.baseProperties = new BaseProperties();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getParentBiodataId() {
		return parentBiodataId;
	}

	public void setParentBiodataId(long parentBiodataId) {
		this.parentBiodataId = parentBiodataId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public long getCustomerRelationId() {
		return customerRelationId;
	}

	public void setCustomerRelationId(long customerRelationId) {
		this.customerRelationId = customerRelationId;
	}

	public BaseProperties getBaseProperties() {
		return baseProperties;
	}

	public void setBaseProperties(BaseProperties baseProperties) {
		this.baseProperties = baseProperties;
	}
}
