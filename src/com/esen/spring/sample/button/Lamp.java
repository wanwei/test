package com.esen.spring.sample.button;

public class Lamp implements ButtonService {

	@Override
	public void turnOn() {
		System.out.println("lamp turnon");
	}

	@Override
	public void turnOff() {
		System.out.println("lamp turnoff");
	}

}
