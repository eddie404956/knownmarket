package com.yecao.ds.dateobject;

import java.util.HashMap;
import java.util.Map;

/**
 * 商品
 * @author apple
 *
 */
public class Merchandise {

	private String id;
	/**
	 * 商品名称
	 * 
	 */
	private String name;
	/**
	 * 商品描述
	 */
	private String description;
	
	/**
	 * 是否会员商品
	 */
	private boolean isFriend;
	
	/**
	 * 商品允许根据不同的有效期设置不同的价格
	 */
	private Map<String,Price> prices=new HashMap<String,Price>();
	
	/**
	 * 商品的优惠券码，可以有多个
	 */
	private Map<String,Coupon> coupons=new HashMap<String,Coupon>();
	
	/**
	 * 商品的所属产品，为具体的东西，如pdf
	 */
	private Map<String,Product> products=new HashMap<String,Product>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isFriend() {
		return isFriend;
	}

	public void setFriend(boolean isFriend) {
		this.isFriend = isFriend;
	}

	public Map<String, Price> getPrices() {
		return prices;
	}

	public void setPrices(Map<String, Price> prices) {
		this.prices = prices;
	}

	


	public Map<String, Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(Map<String, Coupon> coupons) {
		this.coupons = coupons;
	}

	public Map<String, Product> getProducts() {
		return products;
	}

	public void setProducts(Map<String, Product> products) {
		this.products = products;
	}
	
	
	
	
}
