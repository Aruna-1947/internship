package com.javatechie.h2.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class email {
	
	@Id
	@GeneratedValue
	private int id;
	private String From;
	private String To;
	private String Subject;
	private String Body;
	

}
