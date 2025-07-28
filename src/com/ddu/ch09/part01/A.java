package com.ddu.ch09.part01;


public class A {
	
	public A() {
		System.out.println("A 객체가 생성됨");
	}
	// 인스턴스 멤버 클래스 B
	public class B {
		
		B() {
		System.out.println("B 객체가 생성됨");
		}
		int field1;
		public void method1() {
			
		}
}
	public static class C{
		C() {
			System.out.println("c 객체가 생섬됨");
		}
		int field1;
		static int filed2;
		void method1() {
			
		}
		static void method2() {
			
		}
	}
	// 로컬 클래스
	public void methodLocal() {
		class D {
			D() {
				System.out.println("D 객체가 생성됨");
			}
			int field1;
			void method1() {
				
			}
		}
		D d = new D();
		d.field1 = 30;
		d.method1();
	}

}

