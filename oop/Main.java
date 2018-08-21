package oop;

public class Main {

	public static void main(String[] args) {
		//손님생성
		Student jang = new Student("장건일",17);
		Student hong = new Student("홍길동",16);
		Student mang = new Student("망동이",5);
		//손님 돈 정의
		jang.setMoney(100000);
		hong.setMoney(8000);
		mang.setMoney(2000);
		
		//버스 생성
		Bus bus100 = new Bus(100);
		Bus bus101 = new Bus(101);
		
		//버스요금정하기
		bus100.setBusFee(2000);
		bus101.setBusFee(5000);
		
		//버스타기 jang:100, hong:101;
		bus100.makeMoney(jang);
		bus101.makeMoney(hong);
		bus100.makeMoney(mang);
		
		
		jang.studentInfo();
		hong.studentInfo();
		mang.studentInfo();
		
		
		System.out.println("==============");
		bus100.busInfo();
		bus101.busInfo();
		
		
		
		
		
		System.out.println("==============");
		jang.getOff(bus100);
		jang.studentInfo();
		hong.studentInfo();
		mang.studentInfo();
		
		
		System.out.println("==============");
		bus100.busInfo();
		bus101.busInfo();
		
		System.out.println("==============");
		jang.getOff(bus100);
		hong.studentInfo();

		mang.studentInfo();
		
		
		
		
		
		
		
		
		

	}

}
