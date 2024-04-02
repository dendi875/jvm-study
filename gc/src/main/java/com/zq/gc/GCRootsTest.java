package com.zq.gc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author <a href="mailto:quanzhang875@gmail.com">quanzhang875</a>
 * @since  2024-03-22 14:43:49
 */
public class GCRootsTest {

	public static void main(String[] args) {
		List<Object> numList = new ArrayList<>();

		Date birth = new Date();

		for (int i = 0; i < 100; i++) {
			numList.add(String.valueOf(i));
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("数据添加完毕，请操作：");

		new Scanner(System.in).next();
		numList = null;
		birth = null;

		System.out.println("numList、birth已置空，请操作：");
		new Scanner(System.in).next();

		System.out.println("结束");

	}
}
