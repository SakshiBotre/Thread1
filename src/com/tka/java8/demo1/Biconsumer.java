package com.tka.java8.demo1;

public class Biconsumer {
	public static void main(String[] args) {
		new Thread (()-> {
			for(int i=0;i<=10;++i)
				System.out.println(i);
			
			
		
		}).start();
		}

}
