package org.java.demo.pojo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Discount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String title;
	private LocalDate startDate;
	private LocalDate endDate;
	private int rate;
	
	@ManyToOne
	@JoinColumn(name = "pizza_id",nullable = false)
	private Pizza pizza;
	
	public Discount() {}
	public Discount(String title, LocalDate startDate, LocalDate endDate, int rate, Pizza pizza) {
		setTitle(title);
		setStartDate(startDate);
		setEndDate(endDate);
		setRate(rate);
		setPizza(pizza);
	}
	
	public Pizza getPizza() {
		return pizza;
	}
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		
		return "(" + getId() + ") " + getTitle()
		+ "\n" + getStartDate()
		+ "\n" + getEndDate()
		+ "\n" + getRate();
		
	}

}
