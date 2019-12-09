package javalearn;
import java.util.Scanner;

public class Demo_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String str = sc.next();
		
		System.out.println(a);
		System.out.println(str);
	}
}
