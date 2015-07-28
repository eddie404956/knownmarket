package com.yecao.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yecao.ds.dateobject.Merchandise;
import com.yecao.ds.mapper.MerchandiseMapper;
 
@Controller  //类似Struts的Action
public class MerchandiseController {
 
    @RequestMapping("addmerchandise")  // 请求url地址映射，类似Struts的action-mapping
    public ModelAndView reg(@RequestParam(value="name")String name, String description,String isFriend,HttpServletRequest request) {
    	ModelAndView mav=new ModelAndView("index");
       Merchandise merchandise=new Merchandise();
       merchandise.setName(name);
       merchandise.setDescription(description);
       if(StringUtils.isEmpty(isFriend)){
    	   isFriend="false";
       }
       merchandise.setFriend(Boolean.parseBoolean(isFriend));
        mapper.insertMerchandise(merchandise);
        mav.addObject("success", "true");
        return mav;
    }
    
    @RequestMapping("merchandise")
    public String toMerchandise(){
    	return "merchandise";
    }
 
    
 
    @Resource(name = "merchandiseMapper")  
    private MerchandiseMapper mapper;  
 
    
}
