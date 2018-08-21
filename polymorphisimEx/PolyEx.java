package polymorphisimEx;

public class PolyEx {
	public static void main(String args[])
	{
		Super sp = new Super();
		System.out.println(sp.x + sp.y);
		sp.ss();
		
		Child ch = new Child();
		System.out.println(ch.i + ch.j);
		ch.ss();
		
		Super sp1 = new Child(); // 참조 할 수 있는가 없는가에 대한 문제이다. 자식은 부모를 참조 할 수 있디 때문에 선언이 간능하다.
		//Child ch1 = new Super(); 그리나 부모는 자식의 변수를 참조 할 수 없기 때문에 선언이 불가능 하다. 
		System.out.println(sp1.x + sp1.y);
		//System.out.println(sp1.i + sp.j); 부모는 자식의 변수를 참조할 수 없다. 그러나 메서드 오버라이딩 된 것은 접근이 가능하다.
		sp1.ss();
		sp1.cc();
		
		
		
	}
}

class Super
{
	int x = 10;
	int y = 20;
	
	public void cc()
	{
		System.out.println("this is what you want to say cc");
	}
	public void ss()
	{
		System.out.println("I am in the parents class.");
	}
}

class Child extends Super
{
	int i = 100;
	int j = 200;
	public void ss()
	{
		System.out.println("I am in a child class.");
	}
}
