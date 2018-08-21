package polymorphisimEx;

public class MyPloyTest {
	public static void main(String[] args) {
		
		Car car = new Car();
		Truck tr = new Truck();
		car.accel();
		tr.send();
		
		Car car1 = null;
		Truck tr1 = new Truck();
		
		
		car1 = tr1;
		car1.accel();
		car1.breakdown();
		//car1.send();
		
		tr1 = (Truck)car1;
		tr1.send();
		
		
		Car car2 = new Car();
		Truck tr2 = new Truck();
		
		car2 = tr2;
		car2.accel();
//		car2.send();
		tr2 = (Truck)car2;
		
		//tr2 = (Truck)car2;
		tr2.send();
		tr2.accel();
		
		
		
	}
}
