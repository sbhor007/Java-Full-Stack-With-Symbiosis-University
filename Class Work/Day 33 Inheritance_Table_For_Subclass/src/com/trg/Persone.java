package com.trg;

import javax.persistence.*;

@Entity
@Table(name = "persone")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Persone {
	@Id
	private int id;
	@Column(name = "name")
	private String name;
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
	
	public Persone() {}
	
	
}
