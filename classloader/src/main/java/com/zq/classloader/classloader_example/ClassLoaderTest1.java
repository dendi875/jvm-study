package com.zq.classloader.classloader_example;

import sun.misc.Launcher;

import java.net.URL;

public class ClassLoaderTest1 {

	public static void main(String[] args) {
		System.out.println("*********启动类加载器************");

		// 获取 Bootstrap 加载器能够加载的api的路径
		URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
		for (URL url : urLs) {
			System.out.println(url.toExternalForm());
		}

		// 从上面的路径中随意选择一个类，来看看他们的类加载是什么



		System.out.println("*********扩展类加载器************");
		String extDirs = System.getProperty("java.ext.dirs");
		for (String path: extDirs.split(":")) {
			System.out.println(path);
		}

		// 从上面的路径中随意选择一个类，来看看他们的类加载是什么
	}
}
