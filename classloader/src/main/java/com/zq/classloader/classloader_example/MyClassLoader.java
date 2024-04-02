package com.zq.classloader.classloader_example;

import java.io.FileNotFoundException;

/**
 * 自定义 ClassLoader
 *
 * @author <a href="mailto:quanzhang875@gmail.com">quanzhang875</a>
 * @since  2023-11-24 18:59:56
 */
public class MyClassLoader extends ClassLoader {

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		try {
			byte[] result = getClassFromMyPath(name);
			if (result == null) {
				throw new FileNotFoundException();
			} else {
				return defineClass(name, result, 0, result.length);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		throw new ClassNotFoundException();
	}

	private byte[] getClassFromMyPath(String name) {
		// 从用户自定义路径中加载指定类：细节略
		return null;
	}
}
