package com.tka.java8.demo1;

import java.util.function.BiFunction;

public class Test1 {
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer>bi;
		bi=(x,y)->x+y;
		System.out.println(bi.apply(30, 20));
		bi=(x,y)->x/y;
		System.out.println(bi.apply(30, 20));

		bi=(x,y)->x-y;
		System.out.println(bi.apply(30, 20));

		bi=(x,y)->x/y;
		System.out.println(bi.apply(30, 20));

		bi=(x,y)->x*y;
		System.out.println(bi.apply(30, 20));
		bi=(x,y)->x%y;
		
		
		
		System.out.println(bi.apply(30, 20));


		
		
	}

}
