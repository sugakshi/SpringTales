package com.managment.Library_Management.Bean;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.managment.Library_Management.Enums.StudentStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int student_id;
	
	private String name;
	
	@Column(unique = true, nullable = false)
	private String emailId;
	
	private String address;
	
	@Enumerated
	private StudentStatus status;
	
	@OneToMany(mappedBy = "student")
	private List<Book> bookList;
	
	@OneToMany(mappedBy = "student")
	private List<Transaction> transcationList;
	
	@CreationTimestamp
	private Date dateCreated;
	
	@UpdateTimestamp
	private Date updateCreated;
	
}
