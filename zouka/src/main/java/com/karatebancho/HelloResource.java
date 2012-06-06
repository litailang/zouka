package com.karatebancho;

import org.springframework.stereotype.Component;

@Component
public class HelloResource implements SampleResource {

	@Override
	public String sayHello(String message) {
		return String.format("Hello, %s", message);
	}

}
