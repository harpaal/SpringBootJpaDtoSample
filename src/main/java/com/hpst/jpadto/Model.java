package com.hpst.jpadto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "Model")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Model {
	
	@Id
	@GeneratedValue
	@Column(name = "ID", nullable = false)
	private long id;
	
	@Column(name = "VAL", nullable = false)
	private String value;
	
	@Column(name = "NAME", nullable = false)
	private String name;
	
	
}
