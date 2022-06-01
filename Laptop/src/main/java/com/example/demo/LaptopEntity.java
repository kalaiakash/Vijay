package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="info")
public class LaptopEntity {
       @Id
       @GeneratedValue(strategy = GenerationType.AUTO)
       private int id;
       private String laptopbrand;
       private String laptopcolor;
       private int laptopprice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLaptopbrand() {
		return laptopbrand;
	}
	public void setLaptopbrand(String laptopbrand) {
		this.laptopbrand = laptopbrand;
	}
	public String getLaptopcolor() {
		return laptopcolor;
	}
	public void setLaptopcolor(String laptopcolor) {
		this.laptopcolor = laptopcolor;
	}
	public int getLaptopprice() {
		return laptopprice;
	}
	public void setLaptopprice(int laptopprice) {
		this.laptopprice = laptopprice;
	}
       
}
