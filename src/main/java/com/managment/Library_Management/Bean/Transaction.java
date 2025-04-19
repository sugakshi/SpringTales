package com.managment.Library_Management.Bean;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.managment.Library_Management.Enums.TransactionType;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trans_id;
	
	@Enumerated
	private TransactionType transcationType;
	
	@ManyToOne
	@JoinColumn
	private Book book;
	
	@ManyToOne
	@JoinColumn
	private Student student;
	
	@CreationTimestamp
	private Date dateCreated;
	
	@UpdateTimestamp
	private Date updateCreated;
}
