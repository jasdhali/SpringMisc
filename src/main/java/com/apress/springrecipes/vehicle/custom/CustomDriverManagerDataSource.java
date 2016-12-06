package com.apress.springrecipes.vehicle.custom;

import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class CustomDriverManagerDataSource extends DriverManagerDataSource {

	public CustomDriverManagerDataSource() {
		// TODO Auto-generated constructor stub
	}

	public CustomDriverManagerDataSource(String url) {
		super(url);
		// TODO Auto-generated constructor stub
	}

	public CustomDriverManagerDataSource(String url, Properties conProps) {
		super(url, conProps);
		// TODO Auto-generated constructor stub
	}

	public CustomDriverManagerDataSource(String url, String username,
			String password) {
		super(url, username, password);
		// TODO Auto-generated constructor stub
	}

	/*public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		System.out.println("Logger getParentLogger()");
		return null;
	}*/

	@Override
	public int getLoginTimeout() throws SQLException {
		System.out.println("int getLoginTimeout()");
		return super.getLoginTimeout();
	}
}
