package com.example.Constructor_injection_demo;

public class Processor {
	 private String brand;

	    public Processor(String brand) {
	        this.brand = brand;
	    }

	    public void process() {
	        System.out.println("Processor " + brand + " is processing...");
	    }
}
