package com.hpst.jpadto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Model")
public class Model {
	
	@Id
	@GeneratedValue
	@Column(name = "ID", nullable = false)
	private long id;
	
	@Column(name = "VAL", nullable = false)
	private String value;
	
	@Column(name = "NAME", nullable = false)
	private String name;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
