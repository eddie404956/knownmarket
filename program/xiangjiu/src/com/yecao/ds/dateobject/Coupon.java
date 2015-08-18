package com.yecao.ds.dateobject;

public class Coupon {

	private Integer id;
	/**
	 * 优惠码
	 */
	private String code;

	/**
	 * 使用次数限制
	 */
	private String limit;

	/**
	 * 到期时间
	 */
	private String deadLine;
	
	private Integer mid;

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public String getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(String deadLine) {
		this.deadLine = deadLine;
	}
	
	

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}


	@Override
	public String toString() {
		return "Coupon [id=" + id + ", code=" + code + ", limit=" + limit + ", deadLine=" + deadLine + "]";
	}
	
	
}
