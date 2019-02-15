package com.gs.ilp.rest.currencyexchange.currencyexhange;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "CURRENCY_EXCHANGE")
public class CurrencyExchange {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int seq;
	private String currfrom;
	private String currto;
	private long conversionFactor;
	private String port;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	
	public String getCurrfrom() {
		return currfrom;
	}
	public void setCurrfrom(String currfrom) {
		this.currfrom = currfrom;
	}
	public String getCurrto() {
		return currto;
	}
	public void setCurrto(String currto) {
		this.currto = currto;
	}
	public long getConversionFactor() {
		return conversionFactor;
	}
	public void setConversionFactor(long conversionFactor) {
		this.conversionFactor = conversionFactor;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	
	
	
}
