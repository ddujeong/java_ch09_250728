package com.ddu.ch09.part02;

public class MainClass {
	
	public static void operate(Calculator cal) { // 익명객체로 들어옴
		System.out.println("연산결과 : "+ cal.add(10, 20));
	}
	// 매서드에 인터페이스 타입의 매개변수를 전달받아 사용하는 예


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Greeting greeting = new Greeting(); 인터페이스는 인스턴스 생성 불가
		// 인터페이스 Greeting 를 구현한 익명 객체
		Greeting greeting = new Greeting() {
			
			@Override
			public void sayHi() {
				// TODO Auto-generated method stub
				System.out.println("안녕! 하이!");
			}
		};
	
	
		greeting.sayHi();
		System.out.println("=================================================");
		
		// 추상클래스 Animal을  상속한 익명 객체
		Animal animal = new Animal() {
			
			@Override
			void sound() {
				// TODO Auto-generated method stub
				System.out.println("멍멍");
			}
			
			@Override
			void run() {
				// TODO Auto-generated method stub
				System.out.println("깡총깡총");
			}
		};
		
		animal.sound();
		animal.run();
		System.out.println("=================================================");
		
		
		// 메서드의 매개변수로 익명 객체 전달
		operate( new Calculator() {
			// 매개변수가 추상클래스나 인터페이스로 되어있을때 익명객체를 사용
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				
				return a + b; // a 와 b 의 합을 반환하도록 오버라이딩
			}
		}); // Calculator 로 만든 객체만 인수로 넣을 수 있음 -> 불가(인터페이스)
	}

}
// 추상 클래스나 인터페이스는 직접 객체를 생성할 수 없지만, 익명 클래스를 이용해 임시 구현 객체를 만들 수 있음

