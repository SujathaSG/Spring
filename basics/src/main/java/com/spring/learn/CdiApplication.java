package com.spring.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.learn.cdi.CdiDao;

@SpringBootApplication
// Search for components in this package
public class CdiApplication {
	static Logger LOGGER = LoggerFactory.getLogger(CdiApplication.class);

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(CdiApplication.class, args);
		CdiDao cdiDao = appContext.getBean(CdiDao.class);
		LOGGER.info("CdiDao : {}", cdiDao.getComponentJdbcConnection());

	}

}
