package com.example.Constructor_injection_demo;

public class Laptop {

	private Processor processor;

	// Constructor for injection
	public Laptop(Processor processor) {
		this.processor = processor;
	}

	public void start() {
		processor.process();
		System.out.println("Laptop is starting...");
	}

}
