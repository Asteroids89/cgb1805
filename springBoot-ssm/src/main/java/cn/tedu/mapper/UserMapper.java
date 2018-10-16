package cn.tedu.mapper;

import java.util.List;

import cn.tedu.pojo.User;

public interface UserMapper {
	List<User> find();
	User findById(Integer id);
	void insert(User user);
	void update(User user);
	int delete(Integer id);
}
