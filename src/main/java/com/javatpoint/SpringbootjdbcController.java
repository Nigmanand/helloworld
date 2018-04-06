package com.javatpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringbootjdbcController {
	
	@Autowired
	JdbcTemplate jdbc;
	@RequestMapping("/insert")
	public String Index()
	{
		jdbc.execute("insert into user(name, email) values('Nigam', 'nigam845@gmail.com')");
		return "data insert successfully";
	}

}
