package tilesample.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import tilesample.user.User;

@Repository
public class UserDaoImpl implements UserDAO {
	
	JdbcTemplate jdbcTemplate;
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public User findById(Integer id) {
		User user = null;
		String sql = "select * from users where id=:id";
		try {
			user = jdbcTemplate.queryForObject(sql, new Object[]{id}, new UserMapper());
		} catch (EmptyResultDataAccessException e) {
			
		}		
		return user;
	}

	@Override
	public List<User> findAll() {
		String sql = "select * from users";		
		return jdbcTemplate.query(sql, new UserMapper());
	}

	@Override
	public void save(User user) {
		String sql = "insert into customers (customer_id, customer_name, customer_phone, customer_address) values (?,?,?,?)";		
		jdbcTemplate.update(sql, user.getId()et, user.getName(), user.getPassword(), user.getConfirmPassword(), user.getEmail(), user.getAddress(), user.getSex());		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	private static final class UserMapper implements RowMapper<User> {
		
		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setEmail(rs.getString("email"));
			user.setAddress(rs.getString("address"));
			user.setPassword(rs.getString("password"));
			return user;
		}
	}
	
	private static List<String> convertDelimitedStringToList(String delimitedString) {

		List<String> result = new ArrayList<String>();

		if (!StringUtils.isEmpty(delimitedString)) {
			result = Arrays.asList(StringUtils.delimitedListToStringArray(delimitedString, ","));
		}
		return result;

	}

	private String convertListToDelimitedString(List<String> list) {

		String result = "";
		if (list != null) {
			result = StringUtils.arrayToCommaDelimitedString(list.toArray());
		}
		return result;

	}

}
