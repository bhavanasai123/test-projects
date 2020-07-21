package com.objectOriented;


class calculator {
	private int numberOne;
	private int numberTwo;
	
	public calculator() {
		System.out.println("default constructor");
		this.numberOne = 100;
		this.numberTwo = 200;	
	}
	public calculator(int num1) {
		this();
		System.out.println("parameterized Constructor with one integer");
		this.numberOne = num1;
	}
	public calculator(int num1, int num2) {
		this(num1);
		System.out.println("parameterized Constructor with two integers");
		this.numberOne = num1;
		this.numberTwo = num2;

	}
	public calculator(String fname, String lname) {
		System.out.println("string paramaterized constructor");
	}
	public void showNumbers() {
		System.out.println("number one : " + this.numberOne);
		System.out.println("number two : " + this.numberTwo);
	}
}


public class ConstructorChainingExample {

	public static void main(String[] args) {
	
		calculator obj3 = new calculator(100, 200);
		obj3.showNumbers();
	}

}
