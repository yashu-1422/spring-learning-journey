package com.springcore.beanLifeCycle;

public class samosa {
		private Double price;

		public Double getPrice() {
			System.out.println("Inside getter method");
			return price;
		}

		public void setPrice(Double price) {
			System.out.println("Inside setter method");
			this.price = price;
		}

		public samosa() {
			super();
			System.out.println("Inside super class constructor");
			
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "samosa [price=" + price + "]";
		}
		
		public void init() {
			System.out.println("Inside init method");
		}
		
		public void destroy() {
			System.out.println("Inside destroy method");
		}
}
