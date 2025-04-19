package com.managment.Library_Management.Bean;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.managment.Library_Management.Enums.Genre;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int book_id;
	
	@NotNull
	@Column(unique = true, nullable = false)
	private String name;
	
	private int cost;
	
	private int pages;
	
	@Enumerated
	private Genre genre;
	
	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author;
	
	@OneToMany(mappedBy = "book")
	List<Transaction> transactionList;
	
	@ManyToOne
	@JoinColumn
	private Student student;
	
	@CreationTimestamp
	private Date createDate;
	
	@UpdateTimestamp
	private Date updateDate;
	
	
}
