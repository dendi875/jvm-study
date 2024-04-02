package com.zq.overview;

/**
 * jenv shell 11
 * javap -p -v target/classes/com/zq/overview/MyClass.class
 *
 * @author <a href="mailto:quanzhang875@gmail.com">quanzhang875</a>
 * @since  2023-11-24 15:15:26
 */
public class MyClass {
	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		int k = i + j;
		System.out.printf("k = %s\n", k);
	}
}
