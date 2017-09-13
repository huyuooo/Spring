package com.how2java.pojo;

import org.springframework.stereotype.Component;

@Component("c")
public class Category {
	
	private int id = 1;
	private String name = "category 1";
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
}
