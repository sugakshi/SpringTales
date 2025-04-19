package com.managment.Library_Management.DTOs;

import com.managment.Library_Management.Bean.Author;
import com.managment.Library_Management.Bean.Book;
import com.managment.Library_Management.Enums.Genre;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookCreateRequest {
	@NotBlank
	private String name;
	@Positive
	private int cost;
	@Positive
	private int pages;
	
	@NotNull
	private Genre genre;
	@NotNull
	private Author author;
	
	public Book CreateBookObject() {
		return Book.builder().name(name).cost(cost).pages(pages).genre(genre).author(author).build();
	}
}
