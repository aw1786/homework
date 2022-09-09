package com.sh.test.loop;

import java.util.Scanner;


/**
 * - 클래스 : com.sh.test.loop.Test4.java
   - 메소드명 : public void test()
    (문자열의 길이를 리턴하는 String의 메소드를 api에서 찾아 사용할 것)

    문자열과 문자열에서 검색될 문자를 입력 받아 문 
    자열에 그 문자가 몇 개이었는지 개수를 확인하는 
    프로그램을 작성하세요. 
    또, 검색할 문자가 영문자가 아니면 "영문자가 아닙니다." 출력후
    프로그램을 종료하세요. 
    
    출력 예)
       문자열 입력 : application
    검색할 문자 입력 : p
    'p'가 포함된 갯수 : 2 개
    
    
    문자열 입력 : apple_test123
    문자 입력 : ㄱ
    영문자가 아닙니다.
 * 
 *
 */
public class Test4 {
	
	public static void main(String[] args) {
		Test4 test4 = new Test4();
		test4.test();
		
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 :");
		String str = sc.next();
		System.out.print("문자 입력 :");
		char ch = sc.next().charAt(0);
		int count = 0;
			// .length() 문자열의 길이를 구할때 사용하는 메소드
	     if(('A' <= ch && ch <= 'Z') || ( 'a' <= ch && ch <= 'z' )) {
	    	for(int i = 0; i < str.length(); i++) {
	    		if(str.charAt(i) == ch) {
	                    count++;
	    		}
	    	
	    	}
	    
	     System.out.printf("'%c'가 포함된 갯수 :%d\n", ch, count);
	    }
	    else System.out.println("영문자가 아닙니다."); 
	}
}
		
//      //- for문 반복으로 다른 출력들이 너무 많이반복되서 출력값이 제대로 나오지 않음.
//		//  break return 을 잘쓰면 될거같은데 몰루.. 질문
//
//		for(int i = 0; i < str.length(); i++) {
//            if((65 <= str.charAt(i) && str.charAt(i) <= 90) || 
//                    ( 97 <= str.charAt(i) && str.charAt(i) <= 122 )) {
//
//                if(str.charAt(i) == ch) {
//                    count++; }
//                else { System.out.println("영문자가 아닙니다."); break;
//                }
//
//            }
//        
//        }
//        System.out.printf("'%s'가 포함된 갯수 :%d\n", ch, count);
//}
//
//}


