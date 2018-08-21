
public class Polymorphism 
{
	public static void mian(String args[]) {
		Super sp = new Super();
		System.out.println(sp.x + sp.y);

	}
}


class Super{
	int x = 100;
	int y = 200;
	public void ss() {
		System.out.println("Parentes Class");
	}
}


class Child extends Super{
	int z = 1000;
	int j = 2000;
	public void ss()
	{
		System.out.println("Child Class");
	}
}