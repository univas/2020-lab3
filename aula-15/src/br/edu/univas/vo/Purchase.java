package br.edu.univas.vo;

import java.util.Date;

public class Purchase {

	private double value;
	private Date date;
	private int quotes;
	
	public Purchase(double value, Date date, int quotes) {
		super();
		this.value = value;
		this.date = date;
		this.quotes = quotes;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getQuotes() {
		return quotes;
	}

	public void setQuotes(int quotes) {
		this.quotes = quotes;
	}
	
}
