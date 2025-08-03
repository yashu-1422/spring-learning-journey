package com.example.setter_injection_demo;

public class Car {
		private Engine engine;

		public void setEngine(Engine engine) {
			this.engine = engine;
		}
		
		public void drive() {
			engine.start();
			System.out.println("car is driving....");
		}
		
		
}
