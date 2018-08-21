package oop;

public class Student {
	
	private String name;
	private int grade;
	private int money;
	private String state;
	
	public Student() {
		
	}
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int ride(int spent) {
		this.money -= spent;
		this.state = "탑승중";
		return spent;
	}
	
	public void getOff(Bus bus) {
		this.state = "서 내림";
		bus.atDestination();
	}
	
	
	public void studentInfo() {
		System.out.println(name+"의 학년은 "+grade+"이며, 용돈은 "+money+" 남았습니다."+"버스에"+state);
	}
	
	
	
}
