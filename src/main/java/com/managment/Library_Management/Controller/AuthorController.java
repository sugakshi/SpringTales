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

import com.managment.Library_Management.Bean.Author;
import com.managment.Library_Management.Service.ServiceIntrf;

import jakarta.validation.Valid;

@RestController
public class AuthorController {
	@Autowired
	@Qualifier("serviceAuthor")
	ServiceIntrf<Author> serviceAuthor;
	
	@PostMapping("/addAuthor")
	public String addAuthor(@RequestBody @Valid Author Author) {
		serviceAuthor.addData(Author);
		return "Author inserted successfully";
	}
	
	@GetMapping("/showAuthors")
	public ResponseEntity showAuthors() {
		List<Author> Authors = serviceAuthor.getDataList();
		return new ResponseEntity<>(Authors, HttpStatus.OK);
	}
	
	@GetMapping("/getAuthor")
	public ResponseEntity getAuthor(@Valid @RequestParam int id, @RequestParam(required = true) String name) {
		Author Author = serviceAuthor.getDetails(id, name);
		return new ResponseEntity<>(Author, HttpStatus.OK);
	}
	
	@GetMapping("/deleteAuthor")
	public String deleteAuthor(@RequestParam(required = true) int id) {
		serviceAuthor.deleteData(id);
		return "Author deleted successfully";
	}
}
