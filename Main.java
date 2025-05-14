package day16;

 class Vehicle {
    void startEngine() {
		System.out.println("Vehicle engine started");
   }
}
class car extends Vehicle {
	void Drive() {
		System.out.println("Car is driving");
	}
}
class ElectricCar extends car {
	void Chargebattery() {
		System.out.println("Electric car is charging");
	}
}
class bike extends ElectricCar {
	void kickstart() {
		System.out.println("Vehicle engine is started");
		System.out.println("Bike is kick started");
  }
}

public class Main{
	public static void main(String[] args) {
		bike b = new bike();
		b.startEngine();
		b.Drive();
		b.Chargebattery();
		b.kickstart();
	}
		}


