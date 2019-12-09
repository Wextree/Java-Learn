package javalearn;
import java.util.Random;
public class Demo_random {
	
	public static void main(String[] args) {
		Random r = new Random();
		
		// 生成int范围的随机正负整数
		int num = r.nextInt();
		
		// 生成对应的范围整数，左闭右开区间
		int ran = r.nextInt(10);
		
		System.out.println(num);
		System.out.println(ran);
	}
}
