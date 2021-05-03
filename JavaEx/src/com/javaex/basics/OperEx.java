package com.javaex.basics;

public class OperEx {

	public static void main(String[] args) {
		arithOperEx();
		logicOper();
		bitOper();
		bitShift();
		ConditionalOper();
	}
	//3항 연산자 : 조건부 연산
	private static void ConditionalOper() {
		int a = 10;
		
		//a 가 짝수면 짝수 아니면 홀수
		String message;
		// 조건식 ? 참일 때의 값 : 거짓일 때의 값
		message = a % 2 == 0 ? "짝수" : "홀수";
		
		System.out.println(a +"는" + message);
		
		int score = 70;
		
		// 80점 이상이면 good / 80 50 이면 pass / 그 이하면 fail
		message = score >= 80 ? "Good" : 
					score >= 50 ? "Pass" : "Fail" ;
					
		System.out.println("점수 : "+ score + " 결과 :" + message);
		
		
		
	}
	//비트 시프트 연산자
	//비트 단위 이동
	private static void bitShift() {
		int data = 1;
		
		System.out.println(data);
		System.out.println("1비트 왼쪽 시프트 :"+
				Integer.toBinaryString(data << 1));
		System.out.println("4비트 왼쪽 시프트 :"+
				Integer.toBinaryString(data << 4));
		
		data = 0b1000;
		System.out.println("원본 :" +
				Integer.toBinaryString(data));
		System.out.println("1비트 우측 시프트 :"+
				Integer.toBinaryString(data >> 1));
		System.out.println("3비트 우측 시프트 :"+
				Integer.toBinaryString(data >> 3));
		
	}
	
	//비트연산자
	//비트단위로 미세한 조작이 필요할 때 사용
	//하드웨어 제어, 이미지 프로세싱
	private static void bitOper() {
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		
		System.out.println("b1:" + Integer.toBinaryString(b1));
		System.out.println("b2:" + Integer.toBinaryString(b2));
		int result = b1 & b2; // 비트논리곱 둘다 1이어야 1비트로 세팅
		System.out.println("b1&b2 : "+ Integer.toBinaryString(result));
		
		result = b1 | b2; // 비트논리합 둘중 한개만 1이면 1비트로 세팅
		System.out.println("b1|b2 : "+ Integer.toBinaryString(result));
		
		result = ~b1; // 비트논리합 둘중 한개만 1이면 1비트로 세팅
		System.out.println("~b1 : " + Integer.toBinaryString(result));
		
		
	}
	//비교연산, 논리연산
	//결과로 boolean반환, 논리값으로 프로그램의 흐름제어 > 중요
	private static void logicOper() {
		// 비교연산자 > , >= , < , <= , == 같다 , != 같지않다
		int n1 = 7;
		int n2 = 3;
		
		System.out.println("a와 b가 같은가?" + (n1==n2));
		System.out.println("a와 b가 같지않은가?" + (n1 != n2));
		
		//논리 연산: AND ( 논리곱 : && ) , OR (논리합: ||) , NOT (논리부정 : !)
		// > 집합을 떠올리자
		int n3 = 5;
		
		//n3는 0초과 10 미만의 값인가?
			//조건 1 : n3>0
			//조건 2 : n3<10
			// > 조건 1 and 조건 2 : 교집합 영역
		boolean r1 = n3 > 0; //조건1
		boolean r2 = n3 < 10; //조건2
		boolean r1andr2 = r1 && r2; // n3 > 0 && n3 <10
		System.out.println("n3가 0초과 10미만 영역에 있는가?" + r1andr2);
		
		// n3는 0 이하이거나 10이상의 값인가?
		// 조건 1 : n3 <= 0
		// 조건 2 : n3 >= 10
		// > 조건 1 or 조건 2 : 합집합 영역
		
		r1 = n3 <= 0; //조건1
		r2 = n3 >= 10; // 조건2
		boolean r1orr2 = r1 || r2 ; // n3 <= 0 || n3 >= 10
		System.out.println("n3가 0 이하이거나 n3 가 10 이상의 영역?" + r1orr2);
		
		
		//not 논리부정 > true <-> false 반전
		boolean rNot =!( n3 > 0 && n3 < 10); // 여집합 영역
		// -> n3 <= 0 || n3 >= 0
		System.out.println("논리부정:"+ rNot);
	}
	
	//산술 연산자
	
	private static void arithOperEx() {
		int a = 7;
		int b = 3;
		
		//부호 연산자 : + , -
		System.out.println(-a ); // a * -1 
		
		// 사칙연산 + - * / 
		System.out.println(a+ "/" + b + "=" + (a/b)); //정수 나눗셈의 몫
		System.out.println("a를 b로나눈 나머지:" + (a%b)); //정수 나눗셈의 나머지
		
		//정수 / 정수 > 정수
		
		//실제 나눗셈의 결과는?
		System.out.println((float)a / (float)b); // int > float로 변환
		System.out.println((float)a / b); // float 가 더 넓으니 뒤의 피연산자는 float 형으로 자동 변환됨	
		
		System.out.println("---------"); 
		// 증감연산자 ++ , -- 
		// 위치에 따라 연산순서가 달라진다
		a = 7;
		System.out.println("a:" + a);
		System.out.println("전위 증감연산 :" + (++a));
		System.out.println("최종 a :" + a);
		
		a = 7;
		System.out.println("a:" + a);
		System.out.println("후위 증감연산 :" + (a++));
		System.out.println("최종 a :" + a);
		
		// 나눗셈 보충
		a = 7;
		//System.out.println(a / 0); // 정수를 0으로 나누면 ArithmeticException
		System.out.println((float)a /0); // Infinity
		
		// Infinity가 포함된 연산식은 항상 Infinity
		// Infinity의 체크
		
		System.out.println("7.0 /0 은 유한수인가?"  +  Double.isFinite (7.0/0));
		// Infinity 가 포함된 연산식 > Infinity 
		
		System.out.println("0.0 / 0.0 ?" + (0.0/0.0) ); // Not A number
		
		// Nan가 포함된 연산식 > Nan = 여산 불가의 의미
		
		System.out.println("0.0/0.0 is Nan?" + Double.isNaN (0.0/0.0));
		System.out.println(0.0/0.0 + 10);
	}
	
	

}