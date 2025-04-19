package com.managment.Library_Management.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.managment.Library_Management.Bean.Author;
import com.managment.Library_Management.DTOs.BookCreateRequest;
import com.managment.Library_Management.DTOs.StudentCreateRequest;

import jakarta.validation.Valid;

@Service
@Qualifier("serviceAuthor")
public class ServiceAuthor implements ServiceIntrf<Author> {

	@Override
	public void addData(Author obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Author> getDataList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Author getDetails(@Valid int id, String name) {
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
