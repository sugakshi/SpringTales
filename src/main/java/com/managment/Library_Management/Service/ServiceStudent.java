package com.managment.Library_Management.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.managment.Library_Management.Bean.Student;
import com.managment.Library_Management.DTOs.BookCreateRequest;
import com.managment.Library_Management.DTOs.StudentCreateRequest;

import jakarta.validation.Valid;

@Service
@Qualifier("serviceStudent")
public class ServiceStudent implements ServiceIntrf<Student> {

	@Override
	public void addData(Student obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> getDataList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getDetails(@Valid int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addDataBook(@Valid BookCreateRequest book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addDataStudent(@Valid StudentCreateRequest student) {
		// TODO Auto-generated method stub
		
	}

}
