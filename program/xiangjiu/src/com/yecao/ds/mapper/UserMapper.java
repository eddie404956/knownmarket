package com.yecao.ds.mapper;

import java.util.List;

import com.yecao.ds.dateobject.User;

public interface UserMapper {
	public User selectUser(int id);
	
	public User login(String name,String pwd);
	   
    public void insertUser(User user);
   
    public void updateUser(User user);
   
    public void deleteUser(int id);
   
    public List<User> selectAll();
}
