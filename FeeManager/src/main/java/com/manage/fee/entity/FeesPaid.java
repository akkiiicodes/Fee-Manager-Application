package com.manage.fee.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table
public class FeesPaid {

	@Id
	private String feesPaidId;
	@NotBlank
	private String feesId;
	@NotBlank
	private String acadmicYear;
	@NotBlank
	private String standardId;
	@NotBlank
	private String studentId;
	@NotBlank
	private String feeReceivedBy;
	@NotBlank
	private Timestamp feesPaidOn;

	public FeesPaid() {
		super();
	}

	public FeesPaid(String feesPaidId, @NotBlank String feesId, @NotBlank String acadmicYear,
			@NotBlank String standardId, @NotBlank String studentId, @NotBlank String feeReceivedBy,
			@NotBlank Timestamp feesPaidOn) {
		super();
		this.feesPaidId = feesPaidId;
		this.feesId = feesId;
		this.acadmicYear = acadmicYear;
		this.standardId = standardId;
		this.studentId = studentId;
		this.feeReceivedBy = feeReceivedBy;
		this.feesPaidOn = feesPaidOn;
	}

	public String getFeesPaidId() {
		return feesPaidId;
	}

	public void setFeesPaidId(String feesPaidId) {
		this.feesPaidId = feesPaidId;
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

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getFeeReceivedBy() {
		return feeReceivedBy;
	}

	public void setFeeReceivedBy(String feeReceivedBy) {
		this.feeReceivedBy = feeReceivedBy;
	}

	public Timestamp getFeesPaidOn() {
		return feesPaidOn;
	}

	public void setFeesPaidOn(Timestamp feesPaidOn) {
		this.feesPaidOn = feesPaidOn;
	}

	@Override
	public String toString() {
		return "FeesPaid [feesPaidId=" + feesPaidId + ", feesId=" + feesId + ", acadmicYear=" + acadmicYear
				+ ", standardId=" + standardId + ", studentId=" + studentId + ", feeReceivedBy=" + feeReceivedBy
				+ ", feesPaidOn=" + feesPaidOn + "]";
	}

}
