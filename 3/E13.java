//:3/E13.java

/****************Exercise 13***********
 (1) Write a method that displays char values in binary form. Demonstrate 
it using several different characters.  
**************************************/
import static net.mindview.util.Print.*;

public class E13{	
	public static void main(String[] args){
		char a='5',b='c',c='d';
		printBinaryChar(a);
		printBinaryChar(b);
		printBinaryChar(c);
	}
	static void printBinaryChar(char ch){
		print("ch:	"+ch+"\n"+Integer.toBinaryString(ch));
	}
}