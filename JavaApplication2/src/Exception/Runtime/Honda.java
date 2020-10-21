abstract class Vehicle

{

	abstract void run();

	
}



class Car extends Vehicle
{
	void run()
	{
		System.out.println("running car safely");	
	}
	
}

class Bike extends Vehicle
{

	void run()
	{
		System.out.println("running BIKE safely");	
	}
	
}


class Honda
{
	
	public static void main(String[] args)
	{

	Vehicle v;  // reference variable

	v=new Car();
	v.run();
	v=new Bike();
	v.run();
	}

}