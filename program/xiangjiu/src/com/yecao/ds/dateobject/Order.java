package com.yecao.ds.dateobject;

import java.util.Date;

/**
 * 
 * 订单
 * @author apple
 *
 */
public class Order {

	private String id;
	private Date createTime;
	
	/**
	 * 订单所属商品的生产者
	 */
	private User producer;
	
	/**
	 * 订单所属的顾客
	 */
	private User customer;
	
	/**
	 * 订单所属的商品
	 */
	private Merchandise merchandise;
	
	/**
	 * 订单使用的优惠券
	 */
	private Coupon coupon;
	
	/**
	 * 订单所下的价格
	 */
	private Price price;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public User getProducer() {
		return producer;
	}
	public void setProducer(User producer) {
		this.producer = producer;
	}
	public User getCustomer() {
		return customer;
	}
	public void setCustomer(User customer) {
		this.customer = customer;
	}
	public Merchandise getMerchandise() {
		return merchandise;
	}
	public void setMerchandise(Merchandise merchandise) {
		this.merchandise = merchandise;
	}
	public Coupon getCoupon() {
		return coupon;
	}
	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	
	
	
}
