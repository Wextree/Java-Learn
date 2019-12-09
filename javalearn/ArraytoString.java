package javalearn;

public class ArraytoString {
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		String str = "[";
		
		for(int i=0;i<array.length;i++) {
			if(i == array.length-1)
				str += "world" + array[i] + "]";
			else
				str += "world" + array[i] +"#";
		}
		
		System.out.print(str);
	}
}
