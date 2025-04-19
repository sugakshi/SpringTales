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

import com.managment.Library_Management.Bean.Transaction;
import com.managment.Library_Management.Service.ServiceIntrf;

import jakarta.validation.Valid;

@RestController
public class TransactionController {
	@Autowired
	@Qualifier("serviceTrans")
	ServiceIntrf<Transaction> serviceTrans;
	
	@PostMapping("/addTrans")
	public String addTrans(@RequestBody @Valid Transaction Trans) {
		serviceTrans.addData(Trans);
		return "Trans inserted successfully";
	}
	
	@GetMapping("/showTranss")
	public ResponseEntity showTranss() {
		List<Transaction> Transs = serviceTrans.getDataList();
		return new ResponseEntity<>(Transs, HttpStatus.OK);
	}
	
	@GetMapping("/getTrans")
	public ResponseEntity getTrans(@Valid @RequestParam int id, @RequestParam(required = true) String name) {
		Transaction Trans = serviceTrans.getDetails(id, name);
		return new ResponseEntity<>(Trans, HttpStatus.OK);
	}
	
	@GetMapping("/deleteTrans")
	public String deleteTrans(@RequestParam(required = true) int id) {
		serviceTrans.deleteData(id);
		return "Trans deleted successfully";
	}
}
