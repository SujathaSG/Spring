package com.spring.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.component.ComponentDAO;

@SpringBootApplication
@ComponentScan("com.spring.component")
// Search for components in this package
public class ComponentScanApplication {
	static Logger LOGGER = LoggerFactory.getLogger(ComponentScanApplication.class);

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(ComponentScanApplication.class, args);
		ComponentDAO componentDAO = appContext.getBean(ComponentDAO.class);
		LOGGER.info("personDAO1 : {}", componentDAO.getComponentJdbcConnection());

	}

}
