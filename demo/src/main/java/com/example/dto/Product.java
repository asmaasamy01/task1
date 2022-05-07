package com.example.dto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Product {
	private String id;
	private String name;
	@Autowired
	private Sku sku;
	
	public Sku getSku() {
		return sku;
	}

	public void setSku(Sku sku) {
		this.sku = sku;
	}

	public Product() {
		System.out.println("product constructor start");
	}

	public void prodSayHi() {
		System.out.println("hiiii from product");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
