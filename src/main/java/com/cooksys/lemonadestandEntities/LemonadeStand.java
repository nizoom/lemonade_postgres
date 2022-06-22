package com.cooksys.lemonadestandEntities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class LemonadeStand {

	@Id
	@GeneratedValue
	
	private long id;
	
	@Column(nullable=false)
	
	private String name;
	

	@OneToMany
	
	private List <Order> orders; 
}
