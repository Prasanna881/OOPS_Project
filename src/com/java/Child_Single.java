package com.java;

public class Child_Single extends Parent_Single {

	private void Topics() {
		System.out.println("Python and Java");
	}
	
	public static void main(String[] args) {
		
		Child_Single c=new Child_Single();
		c.Topics();
		c.shapes();
		c.color();
		c.fruits();
	}
	
}
