package javalearn;

// ���ɱ�String

public class Demo_String {
	
	public static void main(String[] args) {
		// ͨ�����ֹ��췽������
		String str1 = new String();
		
		char array[] = {'A', 'B', 'C'};
		String str2 = new String(array);
		
		byte b[] = {97, 98, 99};
		String str3 = new String(b);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		String str = "ok";
		System.out.println(str);
	}
}
