package com.managment.Library_Management.Bean;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int author_id;
	
	private String name;
	
	@Column(unique = true, nullable = false)
	@Pattern(regexp = "^[A-Za-z0-9._%+-]+@gmail\\.com$", message = "Only Gmail addresses are allowed")
	private String emailId;
	
	@OneToMany(mappedBy = "author")
	private List<Book> bookList;
	
	@CreationTimestamp
	private Date createDate;
	
	@UpdateTimestamp
	private Date updateDate;
	
}
