package cn.tedu.Service;

import java.util.List;

import cn.tedu.pojo.User;

public interface UserService {
	List<User> findAll();
	User findById(Integer id);
	void insert(User user);
	void update(User user);
	void delete(Integer id);
}
