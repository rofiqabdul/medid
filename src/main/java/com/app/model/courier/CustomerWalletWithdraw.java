package com.app.model.courier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.model.BaseProperties;

@Entity
@Table(name = "t_customer_wallet_withdraw")
public class CustomerWalletWithdraw {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "customer_id")
	private long customerId;
	
	@Column(name = "wallet_default_nominal_id")
	private long walletDefaultNominalId;
	
	@Column(name = "amount")
	private long amount;
	
	@Column(name = "bank_name")
	private String bankName;
	
	@Column(name = "account_number")
	private String accountNumber;
	
	@Column(name = "account_name")
	private String accountName;
	
	@Column(name = "otp")
	private long otp;
	
	private BaseProperties baseProperties;
	
	public CustomerWalletWithdraw() {
		this.baseProperties = new BaseProperties();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public long getWalletDefaultNominalId() {
		return walletDefaultNominalId;
	}

	public void setWalletDefaultNominalId(long walletDefaultNominalId) {
		this.walletDefaultNominalId = walletDefaultNominalId;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public long getOtp() {
		return otp;
	}

	public void setOtp(long otp) {
		this.otp = otp;
	}

	public BaseProperties getBaseProperties() {
		return baseProperties;
	}

	public void setBaseProperties(BaseProperties baseProperties) {
		this.baseProperties = baseProperties;
	}
}
