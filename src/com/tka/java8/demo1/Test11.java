package com.tka.java8.demo1;

public class Test11 {
	public static void main(String[] args) {
		A obj=(x,y,z)->(x*y*z)/100;
		double ans=obj.m1(1000.0,20.0,8.0);
        System.out.println(ans);

	}

}
