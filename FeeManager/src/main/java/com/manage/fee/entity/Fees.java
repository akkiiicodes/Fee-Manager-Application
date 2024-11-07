package com.manage.fee.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table
public class Fees {

	@Id
	private String feesId;
	@NotBlank
	private String acadmicYear;
	@NotBlank
	private String standardId;
	@NotBlank
	private String feeMonth;
	@NotBlank
	private Double feeAmount;
	@NotBlank
	private String feesStatus;
	private Timestamp feesAddedOn;
	private Timestamp feesUpdatedOn;

	public Fees() {
		super();
	}

	public Fees(Timestamp feesAddedOn, Timestamp feesUpdatedOn) {
		super();
		this.feesAddedOn = feesAddedOn;
		this.feesUpdatedOn = feesUpdatedOn;
	}

	public Fees(String feesId, @NotBlank String acadmicYear, @NotBlank String standardId, @NotBlank String feeMonth,
			@NotBlank Double feeAmount, @NotBlank String feesStatus, Timestamp feesAddedOn, Timestamp feesUpdatedOn) {
		super();
		this.feesId = feesId;
		this.acadmicYear = acadmicYear;
		this.standardId = standardId;
		this.feeMonth = feeMonth;
		this.feeAmount = feeAmount;
		this.feesStatus = feesStatus;
		this.feesAddedOn = feesAddedOn;
		this.feesUpdatedOn = feesUpdatedOn;
	}

	public String getFeesId() {
		return feesId;
	}

	public void setFeesId(String feesId) {
		this.feesId = feesId;
	}

	public String getAcadmicYear() {
		return acadmicYear;
	}

	public void setAcadmicYear(String acadmicYear) {
		this.acadmicYear = acadmicYear;
	}

	public String getStandardId() {
		return standardId;
	}

	public void setStandardId(String standardId) {
		this.standardId = standardId;
	}

	public String getFeeMonth() {
		return feeMonth;
	}

	public void setFeeMonth(String feeMonth) {
		this.feeMonth = feeMonth;
	}

	public Double getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(Double feeAmount) {
		this.feeAmount = feeAmount;
	}

	public String getFeesStatus() {
		return feesStatus;
	}

	public void setFeesStatus(String feesStatus) {
		this.feesStatus = feesStatus;
	}

	public Timestamp getFeesAddedOn() {
		return feesAddedOn;
	}

	public void setFeesAddedOn(Timestamp feesAddedOn) {
		this.feesAddedOn = feesAddedOn;
	}

	public Timestamp getFeesUpdatedOn() {
		return feesUpdatedOn;
	}

	public void setFeesUpdatedOn(Timestamp feesUpdatedOn) {
		this.feesUpdatedOn = feesUpdatedOn;
	}

	@Override
	public String toString() {
		return "Fees [feesId=" + feesId + ", acadmicYear=" + acadmicYear + ", standardId=" + standardId + ", feeMonth="
				+ feeMonth + ", feeAmount=" + feeAmount + ", feesStatus=" + feesStatus + ", feesAddedOn=" + feesAddedOn
				+ ", feesUpdatedOn=" + feesUpdatedOn + "]";
	}

}
