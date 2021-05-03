package com.javaex.basics;

public class Types {

	public static void main(String[] args) {
//		floatTypes();
//		booleanEx();
//		charEx();
//		constantEx();
//		constantEx();
//		implicitCasting();
		explicitCasting();
	}

	//	명시적 형변환
	//	표현의 범위 넓을 자료형 -> 좁은 자료형으로 변환
	//	자료의 유실 가능, 개발자가 명시적으로 변환
	private static void explicitCasting() {
		byte b;	//	1바이트 정수형
		int i = 2021;	//	4바이트 정수형
		float f = 123.456f;	//	4바이트 실수형

		System.out.println(Integer.toBinaryString(i));

		b = (byte)i;	//	강제로 캐스팅
		System.out.println("int " + i + " -> byte " + b);

		i = (int)f;
		System.out.println("float " + f + " -> int " + i);

	}
	//	암묵적 형변환
	//	표현의 범위 좁은 자료형 -> 넓은 자료형으로 변환
	//	명시적으로 변환하지 않아도 자바가 변환해준다
	private static void implicitCasting() {
		//	byte(1) < short(2) < int(4) < long(8)
		//		< float(4) < double(8)
		byte b = 10;	//	1바이트 정수형
		System.out.println("byte:" + b);
		int i = b;		//	4바이트 정수형
		System.out.println("int:" + i);
		long l = i;		//	8바이트 정수형
		System.out.println("long:" + l);
		//	자료의 유실 없음
		float f = l;	//	4바이트 실수형 : 바이트 수는 long보다 작지만 표현 범위가 넓다
		System.out.println("long -> float:" + f);
		double d = f;	//	8바이트 실수형
		System.out.println("float -> double:" + d);
	}
}
	//	상수 예제
	//	이유 1. 변경되면 안되는 값을 보호할 때
	//	이유 2. 코드 가독성이 높아진다