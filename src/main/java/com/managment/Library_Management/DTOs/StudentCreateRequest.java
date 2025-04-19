package com.managment.Library_Management.DTOs;

import com.managment.Library_Management.Bean.Student;
import com.managment.Library_Management.Enums.StudentStatus;

import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentCreateRequest {

	@NotBlank
	private String name;
	@NotBlank
	private String emailId;
	
	private String address;

	private StudentStatus status;
	
	public Student createStudentObject() {
		return Student.builder().name(name).emailId(emailId).address(address).status(status).build();
	}
}
