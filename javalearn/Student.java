package javalearn;

public class Student {
	private String name;
	private int age;
	private boolean male;
	
	
	
	public Student() {
		
	}

	public Student(String name, int age, boolean male) {
		super();
		this.name = name;
		this.age = age;
		this.male = male;
	}

	// 成员方法不用加static
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public void eat() {
		System.out.println("我在吃饭饭...");
	}
	
	public void sleep() {
		System.out.println("我在睡觉觉...");
	}
	
	public void study() {
		System.out.println("我在学习！");
	}
}
