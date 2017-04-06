package tilesample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tilesample.dao.UserDAO;
import tilesample.user.User;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	UserDAO userDao;
	
	@Autowired
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}	

	@Override
	public User findById(Integer id) {
		return userDao.findById(id);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public void saveOrUpdate(User user) {
		if(findById(user.getId()) == null) {
			userDao.save(user);
		} else {
			userDao.update(user);
		}
	}

	@Override
	public void delete(int id) {
		userDao.delete(id);
	}

}
