//: 4/E04.java

/*********Exercise 4*************
 (3) Write a program that uses two nested for loops and the modulus 
operator (%) to detect and print prime numbers (integral numbers that are not evenly 
divisible by any other numbers except for themselves and 1).  
*******************************/

import static net.mindview.util.Print.*;

public class E04{
	public static void main(String[] args){
		int i=0;
		while(i<100)
			findPrime(++i);
	}
	static void findPrime(int x){
		int i;
		for(i=2;i<x;i++){
			if(x%i==0){
				print(x+" is not a prime");
				break;
			}
		}
		if(i==x)
			print(x+" is a prime");
	}
}