package tilesample.user;

import java.util.List;

public interface UserDAO {
	User findById(Integer id);
	
	List<User> findAll();

	void saveOrUpdate(User user);
	
	void delete(int id);
}
