package com.stackroute;

import java.util.Arrays;
import java.util.Scanner;

public class LargestDifference {

   	//Do not print anything other than what's expected/asked in problem
    public static void main(String[] args) {
   	//Use Scanner to get input from console
    	Scanner sc = new Scanner(System.in);
    	int total = sc.nextInt();
    	int [] numArray = new int[total];
    	for (int i = 0; i < total; i++) {
    		numArray[i] = sc.nextInt();
		}
    	
    	int index = findLargestDifference(numArray);
    	System.out.println(index);

	}

	public static int findLargestDifference(int[] numbers) {
		int max =0;
		int resIndex = -1;
		
		if(numbers!= null && numbers.length>0) {
			for (int i = 0; i < numbers.length-1; i++) {
				int diff = Math.abs(numbers[i] - numbers[i+1]);
				if(max<diff) {
					max = diff;
					if(numbers[i] < numbers[i+1]) {
						resIndex = i+1;
					}else {
						resIndex = i;
					}
				}else if (max == diff) {
					if(numbers[i] > numbers[i+1]) {
						if(numbers[resIndex] < numbers[i]) {
							resIndex = i;
						}
						
					}else {
						
						if(numbers[resIndex] < numbers[i]) {
							resIndex = i+1;
						}
					}
					
				}
			}
		
			
		}
		return resIndex;
	}

}
