package com.sh.test.array.sort;

import java.util.Arrays;
import java.util.Random;

public class Test {
	
	public static void main(String[] args) {
		Test test = new Test();
		test.test1();
	}
	
	//- 1 ~ 100사이의 난수 10개를 생성해 배열에 대입하고, 오름차순 정렬하세요.
	public void test1() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		for(int i = 0; i < arr.length - 1; i++) {
//			arr[i] = (int)(Math.random() * 100 + 1);
			int min = i;
			
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[min] > arr[j])
					min = j;
//				print(arr, i, j, min);
			}
			swap(arr, i, min);
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
//	public void print(int[] arr, int i, int j, int min) {
//		System.out.printf("%d %d : %s (%d)\n", i, j, Arrays.toString(arr), min);
//	}
	
	public void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
}
