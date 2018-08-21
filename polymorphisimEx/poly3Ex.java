package polymorphisimEx;

public class poly3Ex {
	public static void main(String args[]) {
		Car car = new Car();
		Truck tr = new Truck();
		Car car2 = null;
		
		car2 = tr;
		car2.accel();
		
		
		car = tr; //car을 사용하느 것이나 tr을 참조 하고 있기 때문에 케스팅 기능을 사용하여 사용할 수 있는 것인가?
		tr = (Truck)car;
		tr.send();
		tr.accel();
		
		car.accel();
		tr = (Truck)car; //자손 타입으로 부모의 인스턴스를 참조 할 수 없다.
		
		/*
		 * if(a instanceof Car) : 참조변수 a의 타입이 Car 타입인지를 체크한다.
		 * True or False
		 * 
		 * 
		 * */
		
		if(car2 instanceof Truck)
		{
			System.out.println("Truck");
		}else
		{
			System.out.println("No.");
		}
		
		if(car2 instanceof Car)
		{
			System.out.println("Car");
		}else
		{
			System.out.println("No.");
		}
		
		if(car2 instanceof Object)
		{
			System.out.println("Object");
		}else
		{
			System.out.println("No.");
		}
		

	}
}
