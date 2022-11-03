package com.spring.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
// Adding prototype scope only here create new personDAO and new jdbc connection
// object object every time we
// requested

public class ComponentDAO {

	@Autowired
	ComponentJDBCConnection jdbcConnection;

	public ComponentJDBCConnection getComponentJdbcConnection() {
		return jdbcConnection;
	}

	public void setComponentJdbcConnection(ComponentJDBCConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

}
