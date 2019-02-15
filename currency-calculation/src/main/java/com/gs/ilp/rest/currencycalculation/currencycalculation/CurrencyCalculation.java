package com.gs.ilp.rest.currencycalculation.currencycalculation;

public class CurrencyCalculation {
	private int seq;
	private String from;
	private String to;
	private long conversionFactor;
	private long finalValue;
	private String port;
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public long getFinalValue() {
		return finalValue;
	}
	public void setFinalValue(long finalValue) {
		this.finalValue = finalValue;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public long getConversionFactor() {
		return conversionFactor;
	}
	public void setConversionFactor(long conversionFactor) {
		this.conversionFactor = conversionFactor;
	}
	public CurrencyCalculation(int seq, String from, String to, long conversionFactor, long finalValue, String port) {
		super();
		this.seq = seq;
		this.from = from;
		this.to = to;
		this.conversionFactor = conversionFactor;
		this.finalValue = finalValue;
		this.port = port;
	}
	public CurrencyCalculation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
