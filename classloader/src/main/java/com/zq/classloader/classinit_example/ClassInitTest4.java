package com.zq.classloader.classinit_example;

/**
 * 类加载过程
 *
 * 若该类具有父类，JVM 会保证子类的 <clinit>() 执行前，父类的 <clinit>() 已经执行完毕
 *
 * @author <a href="mailto:quanzhang875@gmail.com">quanzhang875</a>
 * @since  2023-11-21 18:29:39
 */
public class ClassInitTest4 {

	static class Father {
		public static int A = 1;

		static {
			A = 2;
		}
	}

	static class Son extends Father {
		public static int B = A;
	}

	public static void main(String[] args) {
		System.out.println(Son.B);
	}
}
