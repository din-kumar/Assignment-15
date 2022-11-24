package com.example.Groceries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication
public class GroceriesApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		String query = "update groceries set name='dinbandhu' where id=18";
		String SQL = "select * from groceries";
		Groceriesdao a1 = (Groceriesdao) context.getBean("a2");
		int st = a1.saveGroceries(new Groceries(10,"Wheat" ,44, "3Kg"));
	    int st1= a1.updateGroceries(new Groceries(10,"potato" ,44, "4Kg"));
		int st2=a1.deleteGroceries(new Groceries(10,"cookingoil" ,34, "1Kg"));
		
	}

}
