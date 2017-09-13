package com.how2java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.pojo.Category;
import com.how2java.pojo.Product;

public class TestSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });

		Category c = (Category) context.getBean("c");

		System.out.println(c.getId());
		System.out.println(c.getName());
		
		/*
		Category c2 = new Category();
		c2.setId(2);
		c2.setName("category2");
		
		System.out.println(c2.getId());
		System.out.println(c2.getName());
		*/
		Product p = (Product) context.getBean("p");
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		
		System.out.println(p.getCategory().getId());
		System.out.println(p.getCategory().getName());
	}

}
