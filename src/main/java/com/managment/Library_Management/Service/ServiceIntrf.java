package com.managment.Library_Management.Service;

import java.util.List;

import com.managment.Library_Management.DTOs.BookCreateRequest;
import com.managment.Library_Management.DTOs.StudentCreateRequest;

import jakarta.validation.Valid;

public interface ServiceIntrf<T> {
	
	void addData(T obj);

	List<T> getDataList();

	T getDetails(@Valid int id, String name);

	void deleteData(int id);

	void addDataBook(@Valid BookCreateRequest book);

	void addDataStudent(@Valid StudentCreateRequest student);
	
}