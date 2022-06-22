package com.cooksys.lemonadestandEntities;

import java.util.List;

import javax.persistence.Column;

import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@NoArgsConstructor
@Getter
@Setter

public class Lemonade {
	
	@Id
	@GeneratedValue
	
	private long id;
	
	@Column(nullable=false)
	private double lemonJuice;
	
	@Column(nullable=false)
	private double sugar;
	
	@Column(nullable=false)
	private double water;
	
	@Column(nullable=false)
	private int iceCubes;
	
	@Column(nullable=false)
	private double price;
	
	@ManyToOne
//	many lemonades to one order 
	private Order order;
	
	
}
