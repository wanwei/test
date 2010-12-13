package com.esen.spring.sample.button.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.esen.spring.sample.button.Button;
import com.esen.spring.sample.button.Lamp;
import com.esen.spring.sample.button.Led;

@Configuration
public class ButtonConfig {
	@Bean
	public Button buttonService() {
		//return new MyServiceImpl();
		Button bt = new Button("sun");
		bt.setButtonService(lamp());
		return bt;
	}
	
	public @Bean Lamp lamp() {
		return new Lamp();
	}

	public @Bean Led led() {
		return new Led();
	}
}
