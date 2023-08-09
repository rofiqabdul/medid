package com.app.model.menu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.model.BaseProperties;

@Entity
@Table(name = "m_wallet_default_nominal")
public class WalletDefaultNominal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "nominal")
	private long nominal;
	
	private BaseProperties baseProperties;
	
	public WalletDefaultNominal() {
		this.baseProperties = new BaseProperties();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getNominal() {
		return nominal;
	}

	public void setNominal(long nominal) {
		this.nominal = nominal;
	}

	public BaseProperties getBaseProperties() {
		return baseProperties;
	}

	public void setBaseProperties(BaseProperties baseProperties) {
		this.baseProperties = baseProperties;
	}
}
