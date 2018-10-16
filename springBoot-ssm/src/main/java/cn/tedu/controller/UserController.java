package cn.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.Service.UserService;
import cn.tedu.pojo.User;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/findAll")
	public List<User> findAll(){
		return userService.findAll();
	}
	//通过ID查找相应的user
	@RequestMapping("/find/{id}")
	public User find(@PathVariable Integer id) {
		return userService.findById(id);
	}
	//增加user
	@RequestMapping("/insert/{name}/{birthday}/{address}")
	public String insert(User user) {	
		try {
			userService.insert(user);
			return "用户添加成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "用户添加失败";
		}
	}
	//修改user
	@RequestMapping("/update/{name}/{birthday}/{address}/{id}")
	public String update(User user) {	
		try {
			userService.update(user);
			return "用户更新成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "用户更新失败";
		}
	}
	//根据id删除user
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {	
		try {
			userService.delete(id);
			return "用户删除成功";		
		} catch (Exception e) {
			e.printStackTrace();
			return "用户删除失败";
		}
	}
	
}
