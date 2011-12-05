//: 3/E04_Velocity.java
/**
*@auther sonic
*version 1.0v for fun
*/
/**************Exercise****************
Exercise 4:   (2) Write a program that calculates velocity using a constant distance and a 
constant time.  
**************************************/
import java.util.*;
import static net.mindview.util.Print.*;

class Car{
	double speed;
}

public class E04_Velocity{
	public static void main(String[] args){
		Random rand=new Random();
		Car car=new Car();
		double time=rand.nextDouble();
		double length=rand.nextDouble();
		car.speed=length/time;
		print("time is: "+time+"hour");
		print("length is: "+length+"km");
		print("velocity is: "+car.speed);
		
	}
}