package com.zq.classloader.classinit_example;

public class ClassInitTest3 {

	private int a = 1;

	public ClassInitTest3() {
		a = 11;
		int b = 22;
	}

	public static void main(String[] args) {
		int b = 2;
	}
}
