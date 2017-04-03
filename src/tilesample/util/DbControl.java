package tilesample.util;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class DbControl {
	
	private final static String DELETE = "delete";
	private final static String UPDATE = "update";

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public DbControl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public int delete(String type, String table, String key, String value) {
		StringBuilder builder = new StringBuilder();
		if(type.equals(DELETE)) {
			builder.append("delete from " + table + " where " + key + "='?'");
		} else if(type.equals(UPDATE)) {
			builder.append("update " + table + " set " + key + "='?'");
		}		
		return jdbcTemplate.update(builder.toString(), value);
	}
	
}
