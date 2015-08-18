package com.yecao.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.yecao.ds.dateobject.Coupon;
import com.yecao.ds.dateobject.Merchandise;
import com.yecao.ds.dateobject.Price;
import com.yecao.ds.dateobject.Product;
import com.yecao.ds.mapper.MerchandiseMapper;

@Controller // 类似Struts的Action
public class MerchandiseController {

	@RequestMapping("addmerchandise") // 请求url地址映射，类似Struts的action-mapping
	public ModelAndView reg(@RequestParam(value = "name") String name, String description, String isFriend,
			String price, String priceabidance, String coupon, String coupondeadline, String couponlimit,
			MultipartFile product, String activecode, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("merchandisesubmit");
		Merchandise merchandise = new Merchandise();
		merchandise.setName(name);
		merchandise.setDescription(description);
		if (StringUtils.isEmpty(isFriend)) {
			isFriend = "false";
		}
		merchandise.setFriend(Boolean.parseBoolean(isFriend));
		

		mapper.insertMerchandise(merchandise);
		
		int mid=merchandise.getId();
		
		Price priceObject=new Price();
		priceObject.setQuantity(price);
		priceObject.setAbidance(priceabidance);
		priceObject.setMid(mid);
		mapper.insertPrice(priceObject);
		
		Product productObject=new Product();
		productObject.setActiveCode(activecode);
		productObject.setCreateTime(new Date(System.currentTimeMillis()));
		try {
			productObject.setProduct(product.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		productObject.setMid(mid);
		mapper.insertProduct(productObject);
		
		Coupon couponObject=new Coupon();
		couponObject.setCode(coupon);
		couponObject.setDeadLine(coupondeadline);
		couponObject.setLimit(couponlimit);
		couponObject.setMid(mid);
		mapper.insertCoupon(couponObject);
		
		
		
		mav.addObject("success", "true");
		mav.addObject("merchandise", mapper.selectMerchandise(mid));
		return mav;
	}

	@RequestMapping("getone")
	public ModelAndView reg(@RequestParam(value = "id") Integer id, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("merchandisedetail");
		Merchandise merchandise = mapper.selectMerchandise(id);
		mav.addObject("merchanidse", merchandise);
		return mav;
	}

	@RequestMapping("merchandisesubmit")
	public String toMerchandise() {
		return "merchandisesubmit";
	}

	@RequestMapping("listallmerchandise")
	public ModelAndView listAllMerchandise(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("listmerchandise");
		List<Merchandise> merchandises = mapper.selectAll();
		mav.addObject("merchandises", merchandises);
		return mav;
	}

	@Resource(name = "merchandiseMapper")
	private MerchandiseMapper mapper;

}
