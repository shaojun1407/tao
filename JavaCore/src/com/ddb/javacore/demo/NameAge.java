package com.ddb.javacore.demo;

import java.util.Scanner;

public class NameAge {

	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("请输入你的姓名：");
		sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("您的姓名是： " + name);

		// ctrl+alt + 向下箭头，复制选中的行
		System.out.println("请输入你的年龄：");
		String age = sc.nextLine();
		System.out.println("您的年龄是： " + age);

		// 左ctrl++可以放大编辑区代码，-缩小代码
		// ctrl + shift +f 对代码进行格式化！
	}

}
