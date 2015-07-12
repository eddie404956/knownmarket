package com.yecao.dateobject;

import java.sql.Blob;
import java.util.Date;

/**
 * @author eddie
 *
 */
public class Product {

	private String id;
	
	private Blob product;
	
	private Date createTime;

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
	
	
	
	
}
