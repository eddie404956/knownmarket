package com.yecao.ds.dateobject;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品
 * @author apple
 *
 */
public class Merchandise {

	private Integer id;
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
	private List<Price> prices=new ArrayList<Price>();
	
	/**
	 * 商品的优惠券码，可以有多个
	 */
	private List<Coupon> coupons=new ArrayList<Coupon>();
	
	/**
	 * 商品的所属产品，为具体的东西，如pdf
	 */
	private List<Product> products=new ArrayList<Product>();

	

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

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Price> getPrices() {
		return prices;
	}

	public void setPrices(List<Price> prices) {
		this.prices = prices;
	}

	public List<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Merchandise [id=" + id + ", name=" + name + ", description=" + description + ", isFriend=" + isFriend
				+ ", prices=" + prices + ", coupons=" + coupons + ", products=" + products + "]";
	}

	
	
	
	
}
