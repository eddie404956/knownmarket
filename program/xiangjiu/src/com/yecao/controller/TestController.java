package com.yecao.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yecao.ds.mapper.UserMapper;
 
@Controller  //类似Struts的Action
public class TestController {
 
    @RequestMapping("test/login.do")  // 请求url地址映射，类似Struts的action-mapping
    public String testLogin(@RequestParam(value="username")String username, String password, HttpServletRequest request) {
        // @RequestParam是指请求url地址映射中必须含有的参数(除非属性required=false)
        // @RequestParam可简写为：@RequestParam("username")
 
        if (!"admin".equals(username) || !"admin".equals(password)) {
            return "index"; // 跳转页面路径（默认为转发），该路径不需要包含spring-servlet配置文件中配置的前缀和后缀
        }
        return "index";
    }
 
    
 
    @Resource(name = "userMapper")  
    private UserMapper mapper;  
 
    
}
