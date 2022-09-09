package com.sh.test.condition;

import java.util.Scanner;


/**
 * 사용자에게 입력받은 문자하나를 문자타입에 따라 구분해 출력하세요.
 * 입력하신 문자 1 은/는  숫자입니다.
 * 입력하신 문자 c 은/는  알파벳입니다.
 * 입력하신 문자 z 은/는  알파벳입니다.
 * 입력하신 문자 * 은/는  특수문자입니다.
 * 
 *
 */
public class CharTest {

	public static void main(String[] args) {
		CharTest test1 = new CharTest();
		test1.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자, 알파벳, 특수문자를 입력해주세요.");
		System.out.print("문자 입력 :");
		char ch = sc.next().charAt(0);
		
		
		if(48 <= ch && ch <= 57) {
			System.out.printf("입력하신 문자 %c는 숫자입니다.", ch);
		} else if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("입력하신 문자 %c 은/는 알파벳입니다.", ch);
		} else if(('!' <= ch && ch <= '/') || (':' <= ch && ch <= '@') ||
		        ('[' <= ch && ch <= '`') || ('{' <= ch && ch <= '~')) {
			System.out.printf("입력하신 문자 %c 은/는 특수문자입니다.", ch);
	} else { System.out.println(" 잘못 입력하셨습니다.");
		}
	}
}