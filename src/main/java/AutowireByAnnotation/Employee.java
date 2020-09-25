package AutowireByAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Inside setter");
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside constructor");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
}
