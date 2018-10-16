package cn.tedu.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.mapper.UserMapper;
import cn.tedu.pojo.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> findAll() {
		return userMapper.find();
	}
	@Override
	public User findById(Integer id) {
		return userMapper.findById(id);
	}
	@Override
	public void insert(User user) {
		userMapper.insert(user);
		
	}
	@Override
	public void update(User user) {
		userMapper.update(user);
		
	}
	@Override
	public void delete(Integer id) {
		int result = userMapper.delete(id);
		if (result==0) {
			throw new RuntimeException("要删除的用户没有找到");
		}
	}

}
