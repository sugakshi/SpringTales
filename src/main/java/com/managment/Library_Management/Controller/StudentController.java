package com.managment.Library_Management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.managment.Library_Management.Bean.Student;
import com.managment.Library_Management.DTOs.StudentCreateRequest;
import com.managment.Library_Management.Service.ServiceIntrf;

import jakarta.validation.Valid;

@RestController
public class StudentController {
	@Autowired
	@Qualifier("serviceStudent")
	ServiceIntrf<Student> serviceStudent;
	
	@PostMapping("/addStudent")
	public String addStudent(@RequestBody @Valid StudentCreateRequest Student) {
		serviceStudent.addDataStudent(Student);
		return "Student inserted successfully";
	}
	
	@GetMapping("/showStudents")
	public ResponseEntity showStudents() {
		List<Student> Students = serviceStudent.getDataList();
		return new ResponseEntity<>(Students, HttpStatus.OK);
	}
	
	@GetMapping("/getStudent")
	public ResponseEntity getStudent(@Valid @RequestParam int id, @RequestParam(required = true) String name) {
		Student Student = serviceStudent.getDetails(id, name);
		return new ResponseEntity<>(Student, HttpStatus.OK);
	}
	
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam(required = true) int id) {
		serviceStudent.deleteData(id);
		return "Student deleted successfully";
	}
}
