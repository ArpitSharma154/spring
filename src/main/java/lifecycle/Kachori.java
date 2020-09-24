package lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Kachori {

	
	private int price;

	public Kachori() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Kachori [price=" + price + "]";
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("starting..");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("ending");
	}
	
	
}
