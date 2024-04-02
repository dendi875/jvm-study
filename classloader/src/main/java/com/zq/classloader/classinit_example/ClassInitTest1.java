package com.zq.classloader.classinit_example;

public class ClassInitTest1 {

	private static int a = 1;

	static {
		a = 11;
		b = 22;
	}

	private static int b = 2;

	public static void main(String[] args) {
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
}
