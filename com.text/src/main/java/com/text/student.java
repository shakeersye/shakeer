package com.text;

public class student {
private int id;
private String name;
private String email;
private Address adr;
public student(int id, String name, String email, Address adr) {	
	this.id = id;
	this.name = name;
	this.email = email;
	this.adr = adr;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Address getAdr() {
	return adr;
}
public void setAdr(Address adr) {
	this.adr = adr;
}
public void disp()
{
	System.out.println("ID :"+id+"Name :"+name+" email :"+email +"");
	adr.details();
}
}

