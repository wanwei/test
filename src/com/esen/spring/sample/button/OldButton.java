package com.esen.spring.sample.button;

public class OldButton {
	private Lamp lamp;

	private String environment;

	public OldButton(String environment) {
		this.environment = environment;
		this.lamp = new Lamp();
	}

	public void poll() {
		if (environment.equalsIgnoreCase("moon"))
			this.lamp.turnOn();
		else if (environment.equalsIgnoreCase("sun"))
			this.lamp.turnOff();
	}
}
