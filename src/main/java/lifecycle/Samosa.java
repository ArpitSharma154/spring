package lifecycle;

public class Samosa {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void Hi()
	{
		System.out.println("inside init method");
	}
	
	public void Bye() 
	{
		System.out.println("Inside destroy method");
	}
	
	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	

}
