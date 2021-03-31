package com.callor.classes.model;

public class IolistVO {

	private String proName;
	private String tradeDate;
	private String clientName;
	private Boolean divInOut;
	private Integer proQuantity;
	private Integer priceIn;
	private Integer priceOut;
	
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public Boolean getDivInOut() {
		return divInOut;
	}
	public void setDivInOut(Boolean divInOut) {
		this.divInOut = divInOut;
	}
	public Integer getProQuantity() {
		return proQuantity;
	}
	public void setProQuantity(Integer proQuantity) {
		if(proQuantity >= 0 ) {
			this.proQuantity = proQuantity;
		}else {
			this.proQuantity = null;
		}
		
	}
	public Integer getPriceIn() {
		return priceIn;
	}
	public void setPriceIn(Integer priceIn) {
		if(priceIn > 0) {
			this.priceIn = priceIn;	
		}else {
			this.priceIn = null;
		}
	}
	public Integer getPriceOut() {
		return priceOut;
	}
	public void setPriceOut(Integer priceOut) {
		if(priceOut > 0 ) {
			this.priceOut = priceOut;
		}else {
			this.priceOut = null;
		}
		
	}
	
	

}
