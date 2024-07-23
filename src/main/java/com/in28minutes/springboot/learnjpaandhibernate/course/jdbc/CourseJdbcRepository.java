package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
	
	@Autowired
	JdbcTemplate springJdbcTemplate;
	
	private final String INSERT_QUERY = 
			
			"""
					INSERT INTO COURSE(ID, NAME, AUTHOR)
					VALUES(1, 'Spring Boot', 'Elon Musk')
			
			""";
	
	public void insertCourse() {
		springJdbcTemplate.update(INSERT_QUERY);
	}
}
