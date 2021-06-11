package com.techlab.student;

public class Student {
	
	private final int DEFAULT_ID = 100, MAX_AGE = 21, MIN_AGE = 15;
	private int id,age;
	private String name;
	
	public void setId(int pid) {
		id = validateId(pid);
	}
	
	public void setAge(int pAge) {
		age = validateAge(pAge);
	}
	
	public void setName(String pname) {
		name = pname;
	}
	
	public int getId() {
		return id;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	private int validateId(int obj) {
		if(obj >= 1 && obj <= 50) {
			return obj;
		}
		return DEFAULT_ID;
	}
	
	private int validateAge(int obj) {
		if(obj < 15) {
			obj = MIN_AGE;
		}else if(obj > 21) {
			obj = MAX_AGE;
		}
		return obj;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setAge(17);
		s1.setId(24);
		s1.setName("Sam");
		s2.setAge(18);
		s2.setId(25);
		s2.setName("Veronica");
		System.out.println("\nStudent1 Details: ");
		createStudent(s1);
		System.out.println("\nStudent2 Details: ");
		createStudent(s2);
	}
	
	public static void createStudent(Student obj) {
		System.out.println("Id: "+obj.getId());
		System.out.println("Name: "+obj.getName());
		System.out.println("Age: "+obj.getAge());
	}
}
