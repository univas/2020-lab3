package br.edu.univas.vo;

public class CreditCard {

	private String brand;
	private double limit;
	private double amountUsed;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

	public double getAmountUsed() {
		return amountUsed;
	}

	public void setAmountUsed(double amountUsed) {
		this.amountUsed = amountUsed;
	}
	
}
