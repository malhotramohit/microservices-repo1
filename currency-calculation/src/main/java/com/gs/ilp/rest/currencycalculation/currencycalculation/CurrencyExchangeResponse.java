package com.gs.ilp.rest.currencycalculation.currencycalculation;

public class CurrencyExchangeResponse {

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
