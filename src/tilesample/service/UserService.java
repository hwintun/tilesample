package tilesample.service;

import java.util.List;

import tilesample.user.User;

public interface UserService {
	User findById(Integer id);
	
	List<User> findAll();

	void saveOrUpdate(User user);
	
	void delete(int id);
}
