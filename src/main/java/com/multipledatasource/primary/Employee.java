package com.multipledatasource.primary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class Employee {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;

	private String name;

	private int salary;
}