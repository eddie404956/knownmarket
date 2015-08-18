package com.yecao.ds.dateobject;

public class Price {

	private Integer id;
	
	/**
	 * 价格
	 */
	private String quantity;
	
	/**
	 * 持续时间
	 */
	private String abidance;
	
	private Integer mid;
	
	

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}


	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getAbidance() {
		return abidance;
	}

	public void setAbidance(String abidance) {
		this.abidance = abidance;
	}

	@Override
	public String toString() {
		return "Price [id=" + id + ", quantity=" + quantity + ", abidance=" + abidance + "]";
	}
	
	
	
}
