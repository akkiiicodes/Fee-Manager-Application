package com.manage.fee.controller;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.manage.fee.dto.StudentDTO;
import com.manage.fee.entity.Student;
import com.manage.fee.service.StandardService;
import com.manage.fee.service.StudentService;

import jakarta.validation.Valid;

@Controller
public class StudentController {

	private StudentService studentService;
	private StandardService standardService;
	private ObjectMapper objectMapper;

	public StudentController(StudentService studentService, StandardService standardService,  ObjectMapper objectMapper) {
		super();
		this.studentService = studentService;
		this.standardService = standardService;
		this.objectMapper = objectMapper;
	}

	@GetMapping("/students")
	public String getAllStudents(Model model, @RequestParam(name = "page", defaultValue = "1") int page,
			@RequestParam(name = "size", defaultValue = "3") int size) {

		Page<Student> pageStudents = studentService.getAllStudentsPageable(page, size);
		setModelData(pageStudents, model, size);
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		model.addAttribute("student", new Student(timestamp, timestamp));
		model.addAttribute("standards", getStandards());
		model.addAttribute("action", "add");

		return "student";
	}

	@GetMapping("/students/{id}")
	public String getStudent(@PathVariable("id") String id, Model model) {
		int page = 1, size = 3;
		Page<Student> pageStudents = studentService.getAllStudentsPageable(page, size);
		setModelData(pageStudents, model, size);

		model.addAttribute("student", studentService.getStudent(id));
		model.addAttribute("action", "edit");

		return "student";
	}

	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") @Valid StudentDTO student, BindingResult result, Model model) {

		if (result.hasErrors()) {
			int page = 1, size = 3;
			Page<Student> pageStudents = studentService.getAllStudentsPageable(page, size);
			setModelData(pageStudents, model, size);
			model.addAttribute("action", student.getStudentId().length() <= 1 ? "add" : "edit");
			model.addAttribute("student", student);

			return "student";
		}
		studentService.saveStudent(objectMapper.convertValue(student, Student.class));

		return "redirect:/students";
	}

	@GetMapping("/students/delete/{id}")
	public String deleteStudent(@PathVariable("id") String id, Model model) {

		studentService.deleteStudent(id);

		return "redirect:/students";
	}

	@ModelAttribute("standards")
	public List<String> getStandards() {
		List<String> standards = standardService.getStandardList();

		return standards;
	}

	@ModelAttribute("statuses")
	public List<String> getStatuses() {
		return Arrays.asList("Y", "N");
	}

	private void setModelData(Page<Student> pageStudents, Model model, int size) {
		int totalPages = pageStudents.getTotalPages();
		if (totalPages > 0) {
			List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
			model.addAttribute("pageNumbers", pageNumbers);
		}
		model.addAttribute("students", pageStudents.getContent());
		model.addAttribute("standards", getStandards());
		model.addAttribute("currentPage", pageStudents.getNumber() + 1);
		model.addAttribute("totalItems", pageStudents.getTotalElements());
		model.addAttribute("totalPages", pageStudents.getTotalPages());
		model.addAttribute("size", pageStudents.getSize());
		model.addAttribute("pageSize", size);
	}
}
