package com.tsj.demo;

public class HelloWorld {

	public static void main(String[] args) {
		int i = 127;
		byte j=(byte) i;
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		byte k=10;
		System.out.println("k ="+k);
		i=k;//大转小强制转换，小转大自行转换
		System.out.println("i = "+i);
		
		int a = 8;
		a /= 4;//a= a/4
		System.out.println("a /= 4: " +a);
	}
}