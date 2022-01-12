package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="employees")


public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long Id;
@Column(name="first_name")
private String firstName;
@Column(name="last_name")
private String lastName;

private String mail;

private String password; 

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Long getId() {
	return Id;
}

public void setId(Long id) {
	Id = id;
}

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
/*
 * public Long getId() { return Id; } public void setId(Long id) { Id = id; }
 */
@Override
public String toString() {
	return "Employee [Id=" + Id + ", firstName=" + firstName + ", lasttName=" + lastName + ", mail=" + mail
			+ ", password=" + password + "]";
}



	
}
