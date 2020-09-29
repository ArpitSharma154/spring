package Construct;

public class Cons {
	
	private int x;
	private int y;
	public Cons(int x, int y) {
		super();
		this.x = (int)x;
		this.y = (int)y;
	}
	@Override
	public String toString() {
		return (this.x+ " "+this.y);
	}
	public void add() 
	{
		int z;
		z =x+y;
		System.out.println("Sum comes out :"+z);
	}
	
}
