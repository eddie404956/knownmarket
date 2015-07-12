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
	
	
	
	
}
