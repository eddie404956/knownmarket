package com.yecao.ds.dateobject;

import java.sql.Blob;
import java.util.Date;

/**
 * 
 * 具体的用户下载项目，可以是pdf，或者激活码
 * @author eddie
 *
 */
public class Product {

	private String id;
	
	private Object product;
	
	private Date createTime;
	
	private String activeCode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Object getProduct() {
		return product;
	}

	public void setProduct(Object product) {
		this.product = product;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	

	public String getActiveCode() {
		return activeCode;
	}

	public void setActiveCode(String activeCode) {
		this.activeCode = activeCode;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", product=" + product + ", createTime=" + createTime + ", activeCode="
				+ activeCode + "]";
	}
	
	
	
	
}
