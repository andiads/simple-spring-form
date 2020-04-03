package com.andiads.app.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Employee {
	
	@NotNull
	@Size(min = 3)
	private String name;
	
	private long id;
	
	@NotNull
	@Size(min = 7)
	private String contactNumber;
	
	
	
	public Employee() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(final String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(final long id) {
		this.id = id;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(final String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
}

