//: 3/E11.java

/****************Exercise 11***************
 (3) Start with a number that has a binary one in the most significant 
position (hint: Use a hexadecimal constant). Using the signed right-shift operator, right shift 
it all the way through all of its binary positions, each time displaying the result using 
Integer.toBinaryString( ).  
******************************************/
import static net.mindview.util.Print.*;

public class E11{
	public static void main(String[] args){
//		int i=0xffffffff;
		int i=0xbbbbbbbb;
		print(Integer.toBinaryString(i));
		for(int j=0;j<32;j++){			
			i >>= 1;
			print(Integer.toBinaryString(i));
		}
	}
}