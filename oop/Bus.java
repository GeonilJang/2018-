package oop;

public class Bus {
	private int busNum;
	private int busFee;
	
	private int cnt;
	private int income;
	
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	
	public void setBusFee(int busFee) {
		this.busFee = busFee;
	}
	
	public int getBusFee() {
		return this.busFee;
	}
	
	public void makeMoney(Student stu) {
		this.income += stu.ride(busFee);
		cnt++;
	}
	
	public void atDestination() {
		cnt--;
	}
	
	public void busInfo() {
		System.out.println(busNum+ "번 버스에는 승객 "+cnt+"명이 탑승 중입니다. 지금 까지 :"+income+"원 벌었습니다.");
	}
	
	
}
