package com.tka.java8.demo1;

public class Test {
	public static void main(String[] args) {
		X obj;
		obj=(a,b)->a*b;
		System.out.println(obj.ops(45, 10));
		obj=(a,b)->a/b;
		System.out.println(obj.ops(45, 10));
		obj=(a,b)->a-b;
		System.out.println(obj.ops(45, 10));
		obj=(a,b)->a+b;
		System.out.println(obj.ops(45, 10));

		obj=(a,b)->a%b;
		System.out.println(obj.ops(45, 10));

		obj=(a,b)->a*b;
		System.out.println(obj.ops(45, 10));


	}

}
