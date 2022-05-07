package com.example.dto;

import org.springframework.stereotype.Component;

@Component
public class Sku {
	private String id;
	private String name;
	
	public Sku() {
		System.out.println("sku costructor start");
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
	public void skuSayHi() {
		System.out.println("sku say hello");
	}
}
