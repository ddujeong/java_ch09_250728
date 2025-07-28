package com.ddu.ch09.part01;


public class MAINClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		A a = new A(); //a객체 생성
		
		A.B b= a.new B(); //b 객체 생성
		b.field1 = 10;
		b.method1();
		
		A.C c = new A.C();//정적멤버 -> a, 불피료
		
		c.field1 = 100;
		c.method1();
		A.C.filed2 = 50; // static 필드 접근
		A.C.method2();// static 메소드 접근
		
		a.methodLocal(); // 로컬 클래스 객체 생성
		
	}

}
