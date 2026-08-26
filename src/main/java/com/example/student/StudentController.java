package com.example.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping("/save")
	public StudentEntity save(@RequestBody StudentEntity worker) {
		return service.save(worker);
	}
	
	@GetMapping("/get-list")
	public List<StudentEntity> getList() {
		return service.getList();
	}
	@GetMapping("/test")
	public String test() {
		return "Server is working";
	}
	@GetMapping("/test2")
	public String test2() {
		return "Server is working";
	}
	
}
