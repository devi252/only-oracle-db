package com.example.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public StudentEntity save(StudentEntity worker) {
		return repository.save(worker);
	}

	public List<StudentEntity> getList() {
		return repository.findAll();
	}
}
