package com.manage.fee.entity;

import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.PastOrPresent;

@Entity
@Table
public class Student {

	@Id
	private String studentId;
	private String studentNumber;
	@NotBlank
	private String studentName;
	private String studentFatherName;
	private String studentMotherName;
	@Past(message = "Date of Birth should be in past")
	private Date studentDob;
	@NotBlank
	private String studentAddress;
	private String studentStandard;
	@PastOrPresent(message = "Date of addimission cann't be in future")
	private Date studentDoa;
	@NotBlank
	private String studentContactNumber;
	@NotBlank
	private String studentStatus;
	private Timestamp studentAddedOn;
	private Timestamp studentUpdatedOn;
	
	public Student() {
		super();
	}
	
	

	public Student(Timestamp studentAddedOn, Timestamp studentUpdatedOn) {
		super();
		this.studentAddedOn = studentAddedOn;
		this.studentUpdatedOn = studentUpdatedOn;
	}



	public Student(String studentId, String studentNumber, String studentName, String studentFatherName,
			String studentMotherName, Date studentDob, String studentAddress, String studentStandard, Date studentDoa,
			String studentContactNumber, String studentStatus, Timestamp studentAddedOn, Timestamp studentUpdatedOn) {
		super();
		this.studentId = studentId;
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.studentFatherName = studentFatherName;
		this.studentMotherName = studentMotherName;
		this.studentDob = studentDob;
		this.studentAddress = studentAddress;
		this.studentStandard = studentStandard;
		this.studentDoa = studentDoa;
		this.studentContactNumber = studentContactNumber;
		this.studentStatus = studentStatus;
		this.studentAddedOn = studentAddedOn;
		this.studentUpdatedOn = studentUpdatedOn;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentFatherName() {
		return studentFatherName;
	}

	public void setStudentFatherName(String studentFatherName) {
		this.studentFatherName = studentFatherName;
	}

	public String getStudentMotherName() {
		return studentMotherName;
	}

	public void setStudentMotherName(String studentMotherName) {
		this.studentMotherName = studentMotherName;
	}

	public Date getStudentDob() {
		return studentDob;
	}

	public void setStudentDob(Date studentDob) {
		this.studentDob = studentDob;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	public String getStudentStandard() {
		return studentStandard;
	}

	public void setStudentStandard(String studentStandard) {
		this.studentStandard = studentStandard;
	}

	public Date getStudentDoa() {
		return studentDoa;
	}

	public void setStudentDoa(Date studentDoa) {
		this.studentDoa = studentDoa;
	}

	public String getStudentContactNumber() {
		return studentContactNumber;
	}

	public void setStudentContactNumber(String studentContactNumber) {
		this.studentContactNumber = studentContactNumber;
	}

	public String getStudentStatus() {
		return studentStatus;
	}

	public void setStudentStatus(String studentStatus) {
		this.studentStatus = studentStatus;
	}

	public Timestamp getStudentAddedOn() {
		return studentAddedOn;
	}

	public void setStudentAddedOn(Timestamp studentAddedOn) {
		this.studentAddedOn = studentAddedOn;
	}

	public Timestamp getStudentUpdatedOn() {
		return studentUpdatedOn;
	}

	public void setStudentUpdatedOn(Timestamp studentUpdatedOn) {
		this.studentUpdatedOn = studentUpdatedOn;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentNumber=" + studentNumber + ", studentName=" + studentName
				+ ", studentFatherName=" + studentFatherName + ", studentMotherName=" + studentMotherName
				+ ", studentDob=" + studentDob + ", studentAddress=" + studentAddress + ", studentStandard="
				+ studentStandard + ", studentDoa=" + studentDoa + ", studentContactNumber=" + studentContactNumber
				+ ", studentStatus=" + studentStatus + ", studentAddedOn=" + studentAddedOn + ", studentUpdatedOn="
				+ studentUpdatedOn + "]";
	}

	
}
