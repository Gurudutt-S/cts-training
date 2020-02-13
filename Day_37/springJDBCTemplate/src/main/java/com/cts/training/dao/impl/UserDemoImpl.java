package com.cts.training.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.cts.training.bean.UserDemo;
import com.cts.training.dao.UserDemoDAO;

public class UserDemoImpl implements UserDemoDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public boolean saveUser(UserDemo user) {
		String query = "insert into UserDemo values(?,?,?)";
		try {
			jdbcTemplate.update(query, user.getId(), user.getUserName(), user.getPassword());
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteUser(UserDemo user) {
		String query = "delete from userDemo where id=?";
		try {
			jdbcTemplate.update(query, user.getId());
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateUser(UserDemo user) {
		String query = "update userDemo set userName=?,password=?";
		try {
			jdbcTemplate.update(query, user.getUserName(), user.getPassword());
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}
	}

	public UserDemo getUserById(int id) {
		String query = "select * from userDemo where id=?";
		RowMapper<UserDemo> mapper = new BeanPropertyRowMapper<UserDemo>(UserDemo.class);
		return jdbcTemplate.queryForObject(query, mapper, id);
	}

	public List<UserDemo> getAllUsers() {
		return jdbcTemplate.query("select * from userDemo", new ResultSetExtractor<List<UserDemo>>() {
			public List<UserDemo> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<UserDemo> list = new ArrayList<UserDemo>();
				while (rs.next()) {
					UserDemo user = new UserDemo();
					user.setId(rs.getInt("id"));
					user.setUserName(rs.getString("userName"));
					user.setPassword(rs.getString("password"));
					list.add(user);
				}
				return list;
			}
		});
	}
}