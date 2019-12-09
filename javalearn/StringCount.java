package javalearn;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÄãµÄ×Ö·û´´£º");
		String input = sc.next();
		
		int countUpper = 0;
		int countLower = 0;
		int countNum = 0;
		int countOther = 0;
		
		char[] array = input.toCharArray();
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>='A'&&array[i]<='Z')
				countUpper++;
			else if(array[i]>='a'&&array[i]<='z')
				countLower++;
			else if(array[i]>='0'&&array[i]<='9')
				countNum++;
			else {
				countOther++;
			}
		}
		System.out.println("Result:" + countUpper + countLower + countNum +countOther);
	}
}
