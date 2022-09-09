package com.sh.test.condition;

import java.util.Scanner;

/**
 * 수도세를 구하는 프로그램을 작성하세요. 
사용자에게 사용용도와 물사용량을 입력받고, 이에따른 수도세를 계산해 출력하세요.(switch문 사용할 것.)
* 사용요금: 용도별 가격(1liter)  * 사용량
* 수도세: 사용요금의 5%
* 총사용요금: 사용요금 + 수도세
* 사용용도메뉴에서 1,2,3번이외를 선택시에는 "메뉴번호는 1,2,3만 가능합니다."를 출력하고, 프로그램을 종료할 수 합니다.


사용자입력예시)

        ----------menu----------
        1. 가정용 (50원/liter)
        2. 상업용 (45원/liter)
        3. 공업용 (30원/liter)
        -------------------------
        메뉴번호를 선택하세요. ==> 2
        물 사용량을 입력하세요. ==> 250


출력예시)

        ----------<<수도세>>-----------
        선택메뉴번호 :  2. 상업용(업소에서 사용하실 경우)를 선택하셨습니다. 
        사용요금 : 11250
        수도세 : 562
        총수도요금 : 11812 
 *
 */
public class SwitchTest1 {
	
	public static void main(String[] args) {
		SwitchTest1 st = new SwitchTest1();
		st.test();
	}
		public void test() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("----------menu----------");
			System.out.println("1. 가정용 (50원/liter)");
			System.out.println("2. 상업용 (45원/liter)");
			System.out.println("3. 공업용 (30원/liter)");
			System.out.println("-------------------------");
			
			System.out.print("메뉴번호를 선택하세요. :");
			String num = sc.next();
			String menu ="";
			int price = 0;
		
		switch(num) {
		case "1" : 
			menu = "가정용"; 
			price = 50; break;
		case "2" :
			menu = "상업용"; 
			price = 45; break;
		case "3" :
			menu = "공업용"; 
			price = 30; break;
		default : System.out.println("메뉴번호는 1, 2, 3번만 이용가능합니다."); return;
		}
			System.out.print("물 사용량을 입력하세요. :");
			int water = sc.nextInt();
			int waterPrice = water * price;
			int waterTax = waterPrice / 20;
			int totalPrice = waterPrice + waterTax;
			
			System.out.println("----------<<수도세>>-----------");
			
			System.out.printf("선택메뉴번호 : %s. %s을 선택하셨습니다.\n", num, menu );
			System.out.printf("사용요금 : %d\n", waterPrice);
			System.out.printf("수도세 : %d원\n", waterTax);
			System.out.printf("총 수도요금 : %d", totalPrice);
			
			
		}
		
		
		
		
	
}
