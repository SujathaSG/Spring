package com.spring.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.learn.basics.SortAlgorithmImpl;

@SpringBootApplication
public class BasicsApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(BasicsApplication.class, args);
		SortAlgorithmImpl sortImpl = appContext.getBean(SortAlgorithmImpl.class);
		int number = sortImpl.findNumber(new int[]{6, 3,4,7}, 3);
		
		System.out.println("Index : " + number);
	}

}
