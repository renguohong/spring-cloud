package com.intouch.moovie.controller;


import java.util.Objects;

public class Test {
	Integer a=1;
	 Integer b= new Integer(1);



	public static void main(String[] args) {
       Test test= new Test();
		System.out.println(test.a==Integer.valueOf(test.b));
	}
}
