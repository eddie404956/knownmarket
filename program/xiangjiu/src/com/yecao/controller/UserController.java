package com.yecao.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yecao.ds.dateobject.User;
import com.yecao.ds.mapper.UserMapper;
 
@Controller  //类似Struts的Action
public class UserController {
 
    @RequestMapping("doreg")  // 请求url地址映射，类似Struts的action-mapping
    public String reg(@RequestParam(value="username")String username, String password, HttpServletRequest request) {
       User user=new User();
//       user.setId(0);
       user.setUserName(username);
        user.setPassword(password);
        mapper.insertUser(user);
        return "index";
    }
    
    @RequestMapping("userreg")
    public String toReg(){
    	return "userreg";
    }
 
    
 
    @Resource(name = "userMapper")  
    private UserMapper mapper;  
 
    
}
