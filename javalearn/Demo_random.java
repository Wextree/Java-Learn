package javalearn;
import java.util.Random;
public class Demo_random {
	
	public static void main(String[] args) {
		Random r = new Random();
		
		// ����int��Χ�������������
		int num = r.nextInt();
		
		// ���ɶ�Ӧ�ķ�Χ����������ҿ�����
		int ran = r.nextInt(10);
		
		System.out.println(num);
		System.out.println(ran);
	}
}
