package com.cooksys.lemonadestandEntities;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Table(name="order_table")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Order {

	
	@Id
	@GeneratedValue
	
	private long id;
	
	@Column(nullable=false)
	private double total;
	
	@OneToMany
	private List <Lemonade> lemonades;
	
	@ManyToOne
	private Customer customer;
	
	
	@ManyToOne
	private LemonadeStand lemonadeStand;
	
	
	
}
