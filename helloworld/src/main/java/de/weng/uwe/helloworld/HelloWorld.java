package de.weng.uwe.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		HelloWorld obj = new HelloWorld();
		System.out.println(obj.hello("Uwe"));
	}
	
	public String hello(String name) {
		return "Hello " + name + "!";
	}

}
