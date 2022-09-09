package com.sh.test.condition;

import java.util.Scanner;

/**
 * - 클래스 : com.sh.test.condition.Test9.java
- 메소드명 : public void test()

    
       *********주메뉴*********
       a. 불고기버거 ------------5000
       b. 새우버거 --------------4000
       c. 치킨버거 --------------4500
       d. 한우버거 -------------10000
       e. 디버거 ----------------7000
       ***********************    
       
       *******사이드메뉴********
        1. 콜라 -------------------1500
        2. 사이다 -----------------1500
        3. 밀크쉐이크-------------2500
        4. 레드불------------------3000
        ***********************

       두메뉴를 순서대로 제시하고, 각각 사용자선택번호를 받으세요.
    예) 주메뉴에서 a, 선택후 사이드메뉴에서 4 선택시
    “불고기버거, 레드불은 총 8000원입니다“출력.
    
    각메뉴선택시 다른문자를  입력하면 “번호를 잘못 누르셨습니다. 영업을 종료합니다.”
 * 
 *
 */
public class Test9 {
	
	public static void main(String[] args) {
		Test9 t9 = new Test9();
		t9.test();
		
	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		String mm ="*********주메뉴*********\n"
				+ "a. 불고기버거 ------------5000\n"
				+ "b. 새우버거 --------------4000\n"
				+ "c. 치킨버거 --------------4500\n"
				+ "d. 한우버거 -------------10000\n"
				+ "e. 디버거 ----------------7000\n"
				+ "***********************";
		String sm ="*******사이드메뉴********\n"
				+ " 1. 콜라 -------------------1500\n"
				+ " 2. 사이다 -----------------1500\n"
				+ " 3. 밀크쉐이크-------------2500\n"
				+ " 4. 레드불------------------3000\n"
				+ " ***********************\n";

		int tp = 0;
		
			System.out.print(mm);
			String mmChoice = sc.next();
			String str = " ";
		switch(mmChoice) {
		case "a" :
			str ="불고기버거";
			tp += 5000; break;
		case "b" :
			str ="새우버거";
			tp += 4000; break;
		case "c" :
			str = "치킨버거";
			tp += 4500; break;
		case "d" :
			str = "한우버거";
			tp += 10000; break;
		case "e" :
			str= "디버거";
			tp += 7000; break;
		default : System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");
		return;
		}
		
		System.out.println(sm);
		String smChoice =sc.next();
		String strSm = " ";
		
		switch(smChoice) {
		case "1" :
			strSm = "콜라";
			tp += 1500; break;
		case "2" :
			strSm = "사이다";
			tp += 1500; break;
		case "3" :
			strSm = "밀크쉐이크";
			tp += 2500; break;
		case "4" :
			strSm = "레드불";
			tp += 3000; break;
		default : System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");
		return;
		}	
		System.out.printf("%s, %s은(는) 총 %d원입니다.", str, strSm, tp );
		

	
}


}