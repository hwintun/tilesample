package tilesample.dao;

import java.util.List;

import tilesample.user.User;

public interface UserDAO {
	User findById(Integer id);

	List<User> findAll();

	void save(User user);

	void update(User user);

	void delete(Integer id);
}
