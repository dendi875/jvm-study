package com.zq.classloader.classloader_example;

public class ClassLoaderTest {

	public static void main(String[] args) {
		// 获取系统类加载器（应用类加载器）
		ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
		System.out.println(systemClassLoader); //  sun.misc.Launcher$AppClassLoader@18b4aac2

		// 获取上层加载器，扩展类加载器
		ClassLoader extClassLoader = systemClassLoader.getParent();
		System.out.println(extClassLoader); // sun.misc.Launcher$ExtClassLoader@5cad8086

		// 获取上层类加载器，引导类加载器
		ClassLoader bootstrapClassLoader = extClassLoader.getParent();
		System.out.println(bootstrapClassLoader); // null

		// 获取当前类是由哪个类加载器加载的，默认是使用系统里加载器进行加载
		ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
		System.out.println(classLoader); // sun.misc.Launcher$AppClassLoader@18b4aac2

		// Sting 这个类是由哪个类加载加载的，由输出得到 String 类是由引导类加载器加载的
		// 从而推断出Java核心类库都是由引导类加载器加载的
		// Java 核心类库：rt.jar, resources.jar, sun.boot.class.path 路径下的内容
		ClassLoader classLoader1 = String.class.getClassLoader();
		System.out.println(classLoader1); // null
	}
}
