package com.example.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_tbl")
public class StudentEntity {

	@Id
	private int id;
	private String name;
	private String gender;
	private int age;
	private String status;

	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentEntity(int id, String name, String gender, int age, String status) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", status="
				+ status + "]";
	}

}

