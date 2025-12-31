package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.model.Student;



@Component
public class StudentDao {

	@Autowired
	private JdbcTemplate j;
	
	public void setJ(JdbcTemplate j) {
		this.j = j;
	}

	public int insertStduent(Student s) {
		
		String sql="insert into student (name,city,percentage) values(?,?,?)";
		return j.update(sql,new Object[] {s.getName(),s.getCity(),s.getPercentage()});
			
	}
}
