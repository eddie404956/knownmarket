package com.yecao.dateobject;

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
	
	
}
