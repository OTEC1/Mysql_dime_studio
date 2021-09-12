package com.dime_io.in.dick;

import java.sql.Connection;
import org.apache.commons.dbcp.BasicDataSource;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.mariadb.jdbc.MySQLDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Java_Con {

	
	
	
	
	
	private Connection  con;
	public Connection  get_pass() {
	   	
		try {
		  Class.forName(Hash_prod.driver);
			} catch (ClassNotFoundException e1) {
				System.out.println("Driver Error "+e1);}
			
			
		try {
			con = DriverManager.getConnection(Hash_prod.url, Hash_prod.username, Hash_prod.password);
		    } catch (SQLException e) {
			System.out.println(e);}
	
		return con;
	}
	
	
	
	@Bean
    public DataSource mysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(Hash_prod.driver);
        dataSource.setUrl(Hash_prod.url);
        dataSource.setUsername(Hash_prod.username);
        dataSource.setPassword(Hash_prod.password);

        return dataSource;
    }
	
	
	
	
//	private DataSource pass_out() {
//		BasicDataSource bds  = new BasicDataSource();
//		bds.setDriverClassName(Hash_prod.driver);
//		bds.setUrl(Hash_prod.url);
//		bds.setUsername(Hash_prod.username);
//		bds.setPassword(Hash_prod.password);
//		
//		return bds;
//	}
	
	
	
	
}
