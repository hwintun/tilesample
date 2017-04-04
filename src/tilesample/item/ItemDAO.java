package tilesample.item;

import java.util.List;

public interface ItemDAO {
	public Item selectItem(int itemId);
	
	public List<Item> listItem();
	
	public int saveOrUpdateItem(Item item);
	
	public int deleteItem(int itemId, boolean remove);
}
