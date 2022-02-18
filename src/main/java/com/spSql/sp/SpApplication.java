package com.spSql.sp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;

@SpringBootApplication
public class SpApplication implements CommandLineRunner{
	
	@Autowired
	private JdbcTemplate jdbcTemplate; 

	public static void main(String[] args) {
		SpringApplication.run(SpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "SELECT * FROM Details";
		List<Details> customers = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Details.class));
		
		customers.forEach(System.out :: println);
	}

}
