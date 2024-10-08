package com;

public class Product {
	private Integer sofa;
	private Integer desk;
	private Integer bed;
	private Integer sum;
	private Double  msum; 
	public Product(Integer sofa, Integer desk, Integer bed) {
		super();
		this.sofa = sofa;
		this.desk = desk;
		this.bed = bed;
		this.sum=this.sofa*4999+this.desk*3000+this.bed*9999;
		this.msum=this.sum*0.9;
	}

	public Double getMsum() {
		return msum;
	}

	public void setMsum(Double msum) {
		this.msum = msum;
	}

	public Integer getSofa() {
		return sofa;
	}
	public void setSofa(Integer sofa) {
		this.sofa = sofa;
	}
	public Integer getDesk() {
		return desk;
	}
	public void setDesk(Integer desk) {
		this.desk = desk;
	}
	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public Integer getBed() {
		return bed;
	}
	public void setBed(Integer bed) {
		this.bed = bed;
	}
}
