package com.uca.capas.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.constraints.DecimalMin;


public class Product {
	
	@Size(message="La longitud debe ser maximo de 30 caracteres", min=1, max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String name;
	
	@Size(message="La longitud debe ser maximo de 30 caracteres", min=1, max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String brand;
	
	@Size(message="La longitud debe ser maximo de 30 caracteres",min=1,max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String desc;
	
	@Size(message="La longitud debe ser maximo de 30 caracteres", min=1, max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String category;
	
	@NotNull(message="Este campo no puede estar vacio")
	@DecimalMin(message="El precio no puede ser un numero negativo",value="0.00")
	private BigDecimal price;
	
	@NotNull(message="Este campo no puede estar vacio")
	@DateTimeFormat(pattern="dd/MM/yyyy",style="Utilizar el formato adecuado")
	private Date expire_date;
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product( String name, String brand, String desc,	String category, BigDecimal price, Date expire_date) {
		this.name = name;
		this.brand = brand;
		this.desc = desc;
		this.category = category;
		this.price = price;
		this.expire_date = expire_date;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getExpire_date() {
		return expire_date;
	}
	public void setExpire_date(Date expire_date) {
		this.expire_date = expire_date;
	}

	
}
