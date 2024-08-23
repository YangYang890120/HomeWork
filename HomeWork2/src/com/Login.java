package com;

public class Login {
	private String name;
	private String pas;

	public Login(String name, String pas) {
		super();
		this.name = name;
		this.pas = pas;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPas() {
		return pas;
	}

	public void setPas(String pas) {
		this.pas = pas;
	}

}
