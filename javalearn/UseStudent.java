package javalearn;

public class UseStudent {
	
	public static void main(String[] args) {
		Student stu = new Student();
		
		stu.setName("»ÆÕêÊ÷");
		stu.setAge(23);
		stu.setMale(true);
		
		System.out.println(stu.getName());
		System.out.println(stu.getAge());
		System.out.println("Is male:" + stu.isMale());
		
		stu.eat();
		stu.sleep();
		stu.study();
	}
}
