package javalearn;
import java.util.ArrayList;

// ArrayList<E>�����Ƿ��ͣ���һ����������ŵĶ���Ӧ����һ����
// �ҷ���ֻ�������������ͣ����������ǻ�������


public class Demo_ArrayList {
	
	public static void main(String[] args) 	{
		ArrayList<String> array = new ArrayList<>();
		System.out.println(array);
		
		array.add("���");
		array.add("С���");
		array.add("�����");
		array.add("�����");
		System.out.println(array);
		
		String str = array.get(2);
		System.out.println(str);
		
		array.remove(2);
		System.out.println(array);
		
		int size = array.size();
		System.out.println(size);
		
		// ���Ҫװ�ػ������ͣ�Ҫʹ�ö�Ӧ�İ�װ�࣬��java.lang������õ���
		// Interger,Double,Float...
		
		ArrayList<Integer> array_z = new ArrayList<Integer>();
		array_z.add(100);
		System.out.println(array_z);
	}
}
