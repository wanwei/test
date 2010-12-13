package com.esen.spring.sample.auto;

import org.springframework.beans.factory.annotation.Autowired;

public class Button {
	
	private ButtonService bs;

	private String environment;

	public Button() {
		this.environment = "moon";
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
