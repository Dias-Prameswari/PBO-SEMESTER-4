package Transportasi;
public class Bicycle{
	//file ini terhubung dengan file BicycleDemo. dan harus di run melalui file BicycleDemo
int speed = 0;
	int gear = 0; 
	
	//method
	void changeGear(int newValue)
	{
	gear = gear + newValue;
	System.out.println("\nGear: "+gear);
	}
	
	void speedUp(int increment)
	{
	speed = speed + increment;
	System.out.println("\nSpeed: "+speed);
	}
}
