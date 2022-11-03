package com.spring.learn.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
// Adding scope only here doesnt create new objects. since the setter had
// already set the values in personDAO, it doesnt create new object. to overcome
// this use proxy
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)

public class JDBCConnection {

	public JDBCConnection() {
		// TODO Auto-generated constructor stub
	}
}
