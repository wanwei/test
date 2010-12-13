package com.esen.spring.sample.button;

public class Button {

	private ButtonService bs;

	private String environment;

	public Button(String environment) {
		this.environment = environment;
	}

	public void poll() {
		if (environment.equalsIgnoreCase("moon"))
			this.bs.turnOn();
		else if (environment.equalsIgnoreCase("sun"))
			this.bs.turnOff();
	}

	public void setButtonService(ButtonService bs) {
		this.bs = bs;
	}
}
