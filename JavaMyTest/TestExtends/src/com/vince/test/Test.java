package com.vince.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Dog();
		a.show();
	}

}

class Animal{
	String name;
	void show() {
		System.out.println("Animal show!!!");
	}
}

class Dog extends Animal{
	void show() {
		System.out.println("Dog show!!!");
	}
}