package com.zq.classloader.classinit_example;

/**
 * 虚拟机必须保证一个类的 <clinit>() 方法在多线程下被同步加锁
 *
 * @author <a href="mailto:quanzhang875@gmail.com">quanzhang875</a>
 * @since  2023-11-21 18:28:54
 */
public class DeadThreadTest {
	public static void main(String[] args) {
		Runnable r = () -> {
			System.out.println(Thread.currentThread().getName() + "开始");
			DeadThread deadThread = new DeadThread();
			System.out.println(Thread.currentThread().getName() + "结束");
		};

		Thread t1 = new Thread(r, "线程1");
		Thread t2 = new Thread(r, "线程2");

		t1.start();
		t2.start();
	}
}

class DeadThread {
	static {
		if (true) {
			System.out.println(Thread.currentThread().getName() + " 初始化当前类");
			while (true) {

			}
		}
	}
}
