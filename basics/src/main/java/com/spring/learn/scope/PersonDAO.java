package com.spring.learn.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
// Adding prototype scope only here create new personDAO and new jdbc connection
// object object every time we
// requested
public class PersonDAO {

	@Autowired
	JDBCConnection jdbcConnection;

	public JDBCConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JDBCConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

}
