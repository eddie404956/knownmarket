package com.yecao.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yecao.ds.dateobject.User;
import com.yecao.ds.mapper.UserMapper;
 
@Controller  //类似Struts的Action
public class UserController {
 
    @RequestMapping("doreg")  // 请求url地址映射，类似Struts的action-mapping
    public ModelAndView reg(@RequestParam(value="username")String username, String password,String password1,String email,String alipay,String gender,String birthday, HttpServletRequest request) {
    	ModelAndView mav=new ModelAndView("index");
       User user=new User();
       user.setUserName(username);
       if(password==null||!password.equals(password1)){
    	   mav.addObject("success", "false");
    	  return mav;
       }
        user.setPassword(password);
        user.setAlipay(alipay);
        user.setEmail(email);
        user.setGender(gender);
        user.setBirthday(birthday);
        mapper.insertUser(user);
        mav.addObject("success", "true");
        return mav;
    }
    
    @RequestMapping("dologin")  // 请求url地址映射，类似Struts的action-mapping
    public ModelAndView login(@RequestParam(value="username")String username, String password,HttpServletRequest request) {
    	ModelAndView mav=new ModelAndView("index");
       User user=mapper.login(username,password	);
       System.out.println(user);
        mav.addObject("success", "true");
        return mav;
    }
    
    @RequestMapping("userreg")
    public String toReg(){
    	return "userreg";
    }
    
    @RequestMapping("login")
    public String toLogin(){
    	return "userlogin";
    }
 
    
 
    @Resource(name = "userMapper")  
    private UserMapper mapper;  
 
    
}
