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

import com.managment.Library_Management.Bean.Book;
import com.managment.Library_Management.DTOs.BookCreateRequest;
import com.managment.Library_Management.Service.ServiceIntrf;

import jakarta.validation.Valid;

@RestController
public class BookController {
	
	@Autowired
	@Qualifier("serviceBook")
	ServiceIntrf<Book> serviceBook;
	
	@PostMapping("/addBook")
	public String addBook(@RequestBody @Valid BookCreateRequest book) {
		serviceBook.addDataBook(book);
		return "Book inserted successfully";
	}
	
	@GetMapping("/showBooks")
	public ResponseEntity showBooks() {
		List<Book> books = serviceBook.getDataList();
		return new ResponseEntity<>(books, HttpStatus.OK);
	}
	
	@GetMapping("/getBook")
	public ResponseEntity getBook(@Valid @RequestParam int id, @RequestParam(required = true) String name) {
		Book book = serviceBook.getDetails(id, name);
		return new ResponseEntity<>(book, HttpStatus.OK);
	}
	
	@GetMapping("/deleteBook")
	public String deleteBook(@RequestParam(required = true) int id) {
		serviceBook.deleteData(id);
		return "book deleted successfully";
	}
}
