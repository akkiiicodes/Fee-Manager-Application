package com.manage.fee.dto;

import java.sql.Timestamp;

import jakarta.validation.constraints.NotBlank;

public class StandardDTO {
	private String standardId;
	@NotBlank
	private String standardName;
	@NotBlank
	private String standardDivision;
	@NotBlank
	private String standardStatus;
	private Timestamp standardAddedOn;
	private Timestamp standardUpdatedOn;
	
	public StandardDTO() {
		super();
	}
	
	

	public StandardDTO(Timestamp standardAddedOn, Timestamp standardUpdatedOn) {
		super();
		this.standardAddedOn = standardAddedOn;
		this.standardUpdatedOn = standardUpdatedOn;
	}



	public StandardDTO(String standardId, @NotBlank String standardName, @NotBlank String standardDivision,
			@NotBlank String standardStatus, Timestamp standardAddedOn, Timestamp standardUpdatedOn) {
		super();
		this.standardId = standardId;
		this.standardName = standardName;
		this.standardDivision = standardDivision;
		this.standardStatus = standardStatus;
		this.standardAddedOn = standardAddedOn;
		this.standardUpdatedOn = standardUpdatedOn;
	}



	public String getStandardId() {
		return standardId;
	}



	public void setStandardId(String standardId) {
		this.standardId = standardId;
	}



	public String getStandardName() {
		return standardName;
	}



	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}



	public String getStandardDivision() {
		return standardDivision;
	}



	public void setStandardDivision(String standardDivision) {
		this.standardDivision = standardDivision;
	}



	public String getStandardStatus() {
		return standardStatus;
	}



	public void setStandardStatus(String standardStatus) {
		this.standardStatus = standardStatus;
	}



	public Timestamp getStandardAddedOn() {
		return standardAddedOn;
	}



	public void setStandardAddedOn(Timestamp standardAddedOn) {
		this.standardAddedOn = standardAddedOn;
	}



	public Timestamp getStandardUpdatedOn() {
		return standardUpdatedOn;
	}



	public void setStandardUpdatedOn(Timestamp standardUpdatedOn) {
		this.standardUpdatedOn = standardUpdatedOn;
	}



	@Override
	public String toString() {
		return "StandardDTO [standardId=" + standardId + ", standardName=" + standardName + ", standardDivision="
				+ standardDivision + ", standardStatus=" + standardStatus + ", standardAddedOn=" + standardAddedOn
				+ ", standardUpdatedOn=" + standardUpdatedOn + "]";
	}

	
}
