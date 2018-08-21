package polymorphisimEx;

public class Poly7Ex {
	public static void main(String[] args) {
		Car car = null;
		
		FireEngine fe = new FireEngine();
	
		fe.water();
		Truck tr = new Truck();
		tr.send();
		
		car = fe;//업캐스팅.
		car.accel();
		car.breakdown();
		//car.water();
		
		fe = (FireEngine) car; // 다운캐스팅 부모-> 자식으로
		fe.water();
		fe.accel();
		fe.breakdown();
	}
}

class Car
{
	String color;
	int door;
	
	public void accel()
	{
		System.out.println("Driving...");
	}
	public void breakdown()
	{
		System.out.println("Stop...");
	}
}


class FireEngine extends Car
{
	void water()
	{
		System.out.println("Shot water");
	}
}

class Truck extends Car
{
	void send()
	{
		System.out.println("Shavel Send");
	}
	public void accel()
	{
		System.out.println("나는 트럭에 엑셀이다.");
	}
}