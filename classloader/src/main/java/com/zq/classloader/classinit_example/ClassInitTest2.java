package com.zq.classloader.classinit_example;

/**
 * 没有类变量和静态代码块就没有 clinit() 方法
 *
 * @author <a href="mailto:quanzhang875@gmail.com">quanzhang875</a>
 * @since  2023-11-24 18:40:16
 */
public class ClassInitTest2 {

	private int a = 1;

	public static void main(String[] args) {
		int b = 2;
	}

}
