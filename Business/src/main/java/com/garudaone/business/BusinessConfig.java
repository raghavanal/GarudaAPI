package com.garudaone.business;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.garudaone.business.beans.HealthCheck;
import com.garudaone.business.beans.SimpleRetrieval;
import com.garudaone.business.interfaces.SimpleRetrievalInterface;
import com.garudaone.business.model.FutureContractModel;

@Configuration
@PropertySource("classpath:application.properties")
public class BusinessConfig {
	
	@Autowired
	private Environment environment;
	
	@Bean
	public HealthCheck healthCheck()
	{
		return new HealthCheck();
	}
	
	@Bean
	public SimpleRetrieval retrieveData()
	{
		return new SimpleRetrieval(); 
	}
		
	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getProperty("jdbc.driverClassName"));
		dataSource.setUrl(environment.getProperty("jdbc.url"));
		dataSource.setUsername(environment.getProperty("jdbc.username"));
		dataSource.setPassword(environment.getProperty("jdbc.password"));
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource)
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.setResultsMapCaseInsensitive(true);
		return jdbcTemplate;
	}
}
