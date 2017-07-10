package org.jdbc.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class SimpleJdbcDao extends JdbcDaoSupport {
	
	public int getCircleCount() {
		String sql = "select count(*) from Circle";
		return this.getJdbcTemplate().queryForObject(sql, Integer.class);
	}

}
