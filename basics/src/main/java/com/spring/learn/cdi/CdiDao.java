package com.spring.learn.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
// Adding prototype scope only here create new personDAO and new jdbc connection
// object object every time we
// requested

public class CdiDao {

	@Inject
	CdiJDBCConnection jdbcConnection;

	public CdiJDBCConnection getComponentJdbcConnection() {
		return jdbcConnection;
	}

	public void setComponentJdbcConnection(CdiJDBCConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

}
