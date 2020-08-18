package com.edu.pk.model;

	import javax.persistence.Entity;
	import javax.persistence.Id;
	@Entity
	public class Product {
	@Id
	private int id;
	private String name;
	private String color;
	private int price;
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
	public String getColor() {
	return color;
	}
	public void setColor(String color) {
	this.color = color;
	}
	
	public int getPrice() {
		return price;
		}
		public void setPrice(int price) {
		this.price = price;
		}
		@Override
		public String toString() {
		return "Product [id=" + id + ", name=" + name + ", color=" +
		color + ", price=" + price + "]";
		}
	}
		