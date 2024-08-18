package com;

public class HomeWork {
	private	int hotpot1;
	private	int hotpot2;
	private	int hotpot3;
	private String name;
	private int num;
	private	int sum;
	
	public HomeWork(String name, int num) {
		super();
		this.name=name;
		this.num=num;
	}
	
	public HomeWork(int hotpot1, int hotpot2, int hotpot3) {
		super();
		this.hotpot1 = hotpot1;
		this.hotpot2 = hotpot2;
		this.hotpot3 = hotpot3;
		this.sum=this.hotpot1*150+this.hotpot2*160+this.hotpot3*170;
	}
	public HomeWork(int hotpot1, int hotpot2, int hotpot3,String name, int num) {
		super();
		this.hotpot1 = hotpot1;
		this.hotpot2 = hotpot2;
		this.hotpot3 = hotpot3;
		this.name=name;
		this.num=num;
		this.sum=this.hotpot1*150+this.hotpot2*160+this.hotpot3*170;
	}
	public int getHotpot1() {
		return hotpot1;
	}
	public void setHotpot1(int hotpot1) {
		this.hotpot1 = hotpot1;
	}
	public int getHotpot2() {
		return hotpot2;
	}
	public void setHotpot2(int hotpot2) {
		this.hotpot2 = hotpot2;
	}
	public int getHotpot3() {
		return hotpot3;
	}
	public void setHotpot3(int hotpot3) {
		this.hotpot3 = hotpot3;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	

}
