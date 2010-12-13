package com.esen.spring.sample.button;

public class Led implements ButtonService {

	@Override
	public void turnOn() {
		System.out.println("Led turnon");
	}

	@Override
	public void turnOff() {
		System.out.println("Led turnoff");
	}

}
