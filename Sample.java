package com.sh.test.multi.dimentional.array.test;

public class Sample {
	
	public static void main(String[] args) {
		Sample test = new Sample();
//		test.exercise1();
		test.exercise2();
	}
	
	/**
	 * - 메소드명 : public void exercise1()
       - 구현내용 : 
    1. 3행 5열 2차원배열 선언 및 생성
    2. 1~100사이의 임의의 정수를 모든 방에 기록함
    3. 열의 값이 5의 배수인 경우만 값(행,열) 출력함
	 */
	public void exercise1() {
		int[][] arr = new int[3][5];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random() * 100 + 1);
				if(arr[i][j] % 5 == 0) {
				System.out.printf("%d (%d, %d)", arr[i][j], i, j);
				}
			}
			System.out.println();
		}
	}
	
	/**
	 * - 메소드명 : public void exercise2()
       - 구현내용 : 
    1. 3행4열 2차원배열 선언 및 생성
    2. 0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음
    3. 아래의 내용처럼 처리함
        0열    1열    2열    3열    
    0행    값    값    값     0행 값들의 합계
    1행    값    값    값    1행 값들의 합계
    2행    값    값    값    2행 값들의 합계
	 */
	public void exercise2() {
		int[][] arr = new int[3][4];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(j < 3) {
				arr[i][j] = (int)(Math.random() * 100 + 1);
				System.out.print(arr[i][j] + " ");
				}	
				else {
					arr[i][j] = (arr[i][0] + arr[i][1] + arr[i][2]);
					System.out.print(arr[i][j]);
				}
				
			}
			System.out.println();
		}
		
	}
		
}
