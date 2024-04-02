package com.zq.classloader.classloader_example;

/**
 * 获取 ClassLoader 的途径
 * 1. 获取当前类的 ClassLoader
 * 		clazz.getClassLoader()
 * 2. 获取当前线程上下文的 ClassLoader
 * 		Thread.currentThread().getContextClassLoader()
 * 3. 获取系统的 ClassLoader
 * 		ClassLoader.getSystemClassLoader()
 * 4. 获取调用者的 ClassLoader
 * 		DriverManager.getCallerClassLoader()
 *
 * @author <a href="mailto:quanzhang875@gmail.com">quanzhang875</a>
 * @since  2023-11-24 11:59:30
 */
public class ClassLoaderTest2 {

	public static void main(String[] args) {
		try {
			ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
			System.out.println(classLoader);

			ClassLoader classLoader1 = Thread.currentThread().getContextClassLoader();
			System.out.println(classLoader1);

			ClassLoader classLoader2 = ClassLoader.getSystemClassLoader();
			System.out.println(classLoader2);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
