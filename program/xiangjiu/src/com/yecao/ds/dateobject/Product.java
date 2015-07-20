package com.yecao.ds.dateobject;

import java.sql.Blob;
import java.sql.Clob;
import java.util.Date;

/**
 * 
 * 具体的用户下载项目，可以是pdf，或者激活码
 * @author eddie
 *
 */
public class Product {

	private String id;
	
	private Blob product;
	
	private Date createTime;
	
	private Clob activeCode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Blob getProduct() {
		return product;
	}

	public void setProduct(Blob product) {
		this.product = product;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Clob getActiveCode() {
		return activeCode;
	}

	public void setActiveCode(Clob activeCode) {
		this.activeCode = activeCode;
	}
	
	
	
	
}
