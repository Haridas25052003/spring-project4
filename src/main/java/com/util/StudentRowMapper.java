package com.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.model.Student;

public class StudentRowMapper implements RowMapper<Student> {
	
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s=new Student();
		
		s.setId(rs.getInt("id"));
		s.setName(rs.getString("name"));
		s.setCity(rs.getString("city"));
		s.setPercentage(rs.getDouble("percentage"));
		
		return s;
	}
	

}
