package com.yecao.dateobject;

import java.util.Date;

public class Subscribe {

	private String id;
	
	/**
	 * 有限期
	 */
	private Date deadLine;
	
	/**
	 * 最新的产品是否已经推送
	 */
	private boolean isSend;
	
	/**
	 * 订阅要发送的用户
	 */
	private User user;
	
	/**
	 * 订阅对应的商品
	 */
	private Merchandise merchandise;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}

	public boolean isSend() {
		return isSend;
	}

	public void setSend(boolean isSend) {
		this.isSend = isSend;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Merchandise getMerchandise() {
		return merchandise;
	}

	public void setMerchandise(Merchandise merchandise) {
		this.merchandise = merchandise;
	}
	
	
	
	
}
