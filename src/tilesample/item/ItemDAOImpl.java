package tilesample.item;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class ItemDAOImpl implements ItemDAO {
	
	private JdbcTemplate jdbcTemplate;
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//////////////////////////////////////////////////////////////////////////
	//////////////////// PRIVATE METHODS - START /////////////////////////////
	//////////////////////////////////////////////////////////////////////////
	private int insertItem(Item item) {
		String sql = "insert into items (item_id, item_code, item_name, item_description, retail_price, item_weight) values (?,?,?,?,?,?)";
		return jdbcTemplate.update(sql, item.getItemId(), item.getItemCode(), item.getItemName(), item.getItemDescription(), item.getRetailPrice(), item.getItemWeight());
	}
	
	public int updateItem(Item item) {
		String sql = "update items set item_code=?, item_name=?, item_description=?, retail_price=?, item_weight=? where item_id=?";
		return jdbcTemplate.update(item.getItemCode(), item.getItemName(), item.getItemDescription(), item.getRetailPrice(), item.getItemWeight(), sql, item.getItemId());
	}
	//////////////////////////////////////////////////////////////////////////
	//////////////////// PRIVATE METHODS - END ///////////////////////////////
	//////////////////////////////////////////////////////////////////////////
	
	@Override
	public Item selectItem(String itemId) {
		final Item item = new Item();
		String sql = "select * from items where item_id=" + itemId;
		
		return jdbcTemplate.query(sql, new ResultSetExtractor<Item>(){

			@Override
			public Item extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {
					item.setItemId(rs.getInt("item_id"));
					item.setItemCode(rs.getString("item_code"));
					item.setItemName(rs.getString("item_name"));
					item.setItemDescription(rs.getString("item_description"));
					item.setRetailPrice(rs.getFloat("retail_price"));
					item.setItemWeight(rs.getString("item_weight"));
					return item;
				}
				return null;
			}
		});
	}

	@Override
	public List<Item> listItem() {
		String sql = "select * from items";
		List<Item> itemList = jdbcTemplate.query(sql, new RowMapper<Item>(){

			@Override
			public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
				Item item = new Item();
				item.setItemId(rs.getInt("item_id"));
				item.setItemCode(rs.getString("item_code"));
				item.setItemName(rs.getString("item_name"));
				item.setItemDescription(rs.getString("item_description"));
				item.setRetailPrice(rs.getFloat("retail_price"));
				item.setItemWeight(rs.getString("item_weight"));
				return item;
			}			
		});
		return itemList;
	}

	@Override
	public int saveOrUpdateItem(Item item) {
		if(item.getItemId() > 0) {
			return updateItem(item);
		} else {
			return insertItem(item);
		}
	}

	@Override
	public int deleteItem(String itemId, boolean remove) {
		if(!remove) 
			return deleteItem(itemId);
		String sql = "delete from items where item_id=?";		
		return jdbcTemplate.update(sql, itemId);
	}

	@Override
	public int deleteItem(String itemId) {
		String sql = "update items set delete_flag = 1 where item_id=?";
		return jdbcTemplate.update(sql, itemId);
	}
}
