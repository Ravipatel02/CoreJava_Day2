package Question8;

public abstract class Car implements Vehicle {
	
	@Override
	public void drive() {
		System.out.println("Driving car ...");
		
	}
	
	abstract void fuleType();

}
