//: 3/E12.java

/***********Exercise 12*************
 (3) Start with a number that is all binary ones. Left shift it, then use the 
unsigned right-shift operator to right shift through all of its binary positions, each time 
displaying the result using Integer.toBinaryString( ).  
**********************************/

import static net.mindview.util.Print.*;

public class E12{
	public static void main(String[] args){
		int s=0xffff;
		print(Integer.toBinaryString(s));
		s <<= 1;
		for(int i=0;i<16;i++){
			s >>>= 1;
			print(Integer.toBinaryString(s));
		}
	}
}