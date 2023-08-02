package com.app.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.model.BaseProperties;

@Entity
@Table(name = "m_doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "biodata_id")
	private long biodataId;
	
	@Column(name = "str")
	private String str;
	
	private BaseProperties baseProeprties;
	
	public Doctor() {
		this.baseProeprties = new BaseProperties();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getBiodataId() {
		return biodataId;
	}

	public void setBiodataId(long biodataId) {
		this.biodataId = biodataId;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public BaseProperties getBaseProeprties() {
		return baseProeprties;
	}

	public void setBaseProeprties(BaseProperties baseProeprties) {
		this.baseProeprties = baseProeprties;
	}
}
