package com.managment.Library_Management.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.managment.Library_Management.Bean.Book;
import com.managment.Library_Management.DTOs.BookCreateRequest;
import com.managment.Library_Management.DTOs.StudentCreateRequest;

import jakarta.validation.Valid;

@Service
@Qualifier("serviceBook")
public class ServiceBook implements ServiceIntrf<Book> {

	@Override
	public void addData(Book obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> getDataList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getDetails(@Valid int id, String name) {
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
