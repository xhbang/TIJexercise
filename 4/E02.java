//: 4/E02.java

/****************Exercise 2****************
 (2) Write a program that generates 25 random int values. For each value, 
use an if-else statement to classify it as greater than, less than, or equal to a second 
randomly generated value. 
******************************************/
import java.util.*;
import static net.mindview.util.Print.*;

public class E02{
	public static void main(String[] args){
		Random rand=new Random();
		int value,value2;
		value2=rand.nextInt(100);
		for(int i=0;i<25;i++){
			if((value=rand.nextInt(100))>value2)
				print(value+"	is larger than	"+value2);
			else
				print(value+"	is less than	"+value2);
		}
	}
}