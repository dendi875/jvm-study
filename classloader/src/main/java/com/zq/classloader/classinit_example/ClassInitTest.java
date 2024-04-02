package com.zq.classloader.classinit_example;

/**
 * 类的加载过程--初始化阶段
 * 1. 初始化阶段就是执行类的构造器方法 <clinit()>的过程。
 * clinit() 不需要定义，是 javac 编译器自动收集类中的所有类变量的赋值动作和静态代码块中的语句合并而来。
 * 2. clinit() 构造器方法中的指令按语句在源文件中出现的顺序执行
 *
 * @author <a href="mailto:quanzhang875@gmail.com">quanzhang875</a>
 * @since  2023-11-24 15:25:42
 */
public class ClassInitTest {

	private static int a = 1;

	public static void main(String[] args) {
		System.out.print(a);
	}
}
