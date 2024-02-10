package com.almaaz.displayservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.almaaz.displayservice.model.Employee;
import com.almaaz.displayservice.repository.DisplayRepository;


@RestController
@RequestMapping("/list")
public class DisplayController {
	
	@Autowired
	DisplayRepository displayrepository;
	
	@GetMapping("/listEmployee")
	public ResponseEntity<List<Employee>> listEmployee() {
		
		List<Employee> employees = displayrepository.findAll();
		return new ResponseEntity<>(employees,HttpStatus.OK);
		
	}
	
	@GetMapping("/searchEmployee")
	public ResponseEntity<List<Employee>> searchEmployee(@RequestParam String name){
		List<Employee> employees = displayrepository.findByName(name);
		return new ResponseEntity<>(employees,HttpStatus.OK);
	}
	
}
