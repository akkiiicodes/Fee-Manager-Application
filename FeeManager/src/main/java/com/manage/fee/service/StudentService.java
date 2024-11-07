package com.manage.fee.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.manage.fee.entity.Student;
import com.manage.fee.repo.StudentRepo;
import com.manage.fee.utils.FeeManagerConstants;

@Service
public class StudentService {

	private StudentRepo studentRepo;

	public StudentService(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	public Page<Student> getAllStudentsPageable(int page, int size) {
		System.out.println("Page:"+page+", Size:"+size);
		Pageable pageable = PageRequest.of(page-1, size);
		
		Page<Student> pageStudents = studentRepo.findAll(pageable);
		
		return pageStudents;
	}
	
	public List<Student> getAllStudents() {
		
		return studentRepo.findAll();
	}

	public Student getStudent(String id) {
		Optional<Student> optionalStudent = studentRepo.findById(id);
		if (optionalStudent.isPresent()) {
			return optionalStudent.get();
		}

		return null;
	}

	public int deleteStudent(String studentId) {
		Student student = getStudent(studentId);
		if (Objects.nonNull(student)) {
			student.setStudentStatus(FeeManagerConstants.NO_STR);

			studentRepo.save(student);
		}

		return 1;
	}

	public int saveStudent(Student student) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		if (Objects.nonNull(student.getStudentId()) && student.getStudentId().isBlank()) {

			student.setStudentId(UUID.randomUUID().toString());
			student.setStudentNumber(UUID.randomUUID().toString());
			student.setStudentAddedOn(timestamp);
			
		} else {
			Student studentExisting = getStudent(student.getStudentId());
			if (Objects.isNull(studentExisting)) {
				student = null;
			}
		}

		if (Objects.nonNull(student)) {
			student.setStudentUpdatedOn(timestamp);
			System.out.println("student:-> "+student);
			studentRepo.save(student);
		}

		return 1;
	}
}
