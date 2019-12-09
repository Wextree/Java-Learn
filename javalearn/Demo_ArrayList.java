package javalearn;
import java.util.ArrayList;

// ArrayList<E>里面是泛型，即一组数组里面放的东西应该是一样的
// 且泛型只可以是引用类型，而不可以是基本类型


public class Demo_ArrayList {
	
	public static void main(String[] args) 	{
		ArrayList<String> array = new ArrayList<>();
		System.out.println(array);
		
		array.add("随便");
		array.add("小随便");
		array.add("中随便");
		array.add("大随便");
		System.out.println(array);
		
		String str = array.get(2);
		System.out.println(str);
		
		array.remove(2);
		System.out.println(array);
		
		int size = array.size();
		System.out.println(size);
		
		// 如果要装载基本类型，要使用对应的包装类，在java.lang包里，不用导入
		// Interger,Double,Float...
		
		ArrayList<Integer> array_z = new ArrayList<Integer>();
		array_z.add(100);
		System.out.println(array_z);
	}
}
