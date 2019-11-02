package com.lopera.model;

/**
 * Clase Usuario
 * 
 * @author Willian Lopera
 *
 */
public class User {

	private Integer id;
	private String firstname;
	private String lastnama;
	private int age;
	private Address address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastnama() {
		return lastnama;
	}

	public void setLastnama(String lastnama) {
		this.lastnama = lastnama;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public User() {}

	public User(Integer id, String firstname, String lastnama, int age, Address address) {
		this.id = id;
		this.firstname = firstname;
		this.lastnama = lastnama;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastnama=" + lastnama + ", age=" + age + ", address="
				+ address + "]";
	}
}