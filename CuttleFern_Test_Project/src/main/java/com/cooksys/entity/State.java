package com.cooksys.entity;

import javax.persistence.*;

@Entity
@Table
public class State {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String name;

	public State() {
		
	}
	
	public State(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
//"id": "number",
//"name": "string"