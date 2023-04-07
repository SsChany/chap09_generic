package com.javalab.generic.pkg05;
/*
 * 제네릭 메소드를 사용하는 실행 클래스
 */
public class GenericExample {
	
	//제네릭 메소드 boxing()
	// -맨앞의 <T>는 타입 파라미터
	// -Box<T>의 <T>는  반환타입
	// -boxing(T t)의 T는 메소드명 (파라미터)
	// 세개의 T는 모두 같은 알파벳이여아됨 (대문자)
	public static <T> Box<T> boxing(T t){	//리턴해서 나가는 box도 제네릭객체임 
		Box<T> box = new Box<T>();
		box.set(t);
		return box;	//제네릭 객체(Integer객체를 갖고있는)
	}

	//main 메소드
	public static void main(String[] args) {
		
		Box<Integer> box1 = boxing(100); // 제네릭 메소드
		int  intValue = box1.get();
		System.out.println(intValue);
		
		//제네릭 메소드 호출
		Box<String> box2 = boxing("홍길동"); // 제네릭 메소드
		String strValue =box2.get();
		System.out.println(strValue);
	}
}
