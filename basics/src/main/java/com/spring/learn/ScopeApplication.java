package com.spring.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.learn.scope.JDBCConnection;
import com.spring.learn.scope.PersonDAO;

@SpringBootApplication
public class ScopeApplication {
	static Logger LOGGER = LoggerFactory.getLogger(ScopeApplication.class);

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(ScopeApplication.class, args);
		PersonDAO personDAO1 = appContext.getBean(PersonDAO.class);
		JDBCConnection jdbcConnection1 = personDAO1.getJdbcConnection();

		LOGGER.info("personDAO1 : {}", personDAO1);
		LOGGER.info("jdbcConnection1 : {}", jdbcConnection1);

		PersonDAO personDAO2 = appContext.getBean(PersonDAO.class);
		JDBCConnection jdbcConnection2 = personDAO1.getJdbcConnection();

		LOGGER.info("personDAO2 : {}", personDAO2);
		LOGGER.info("jdbcConnection2 : {}", jdbcConnection2);

	}

}
