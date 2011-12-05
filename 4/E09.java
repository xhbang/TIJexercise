//: 4/E09.java
/***********Exercise 9***********
 (4) A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 
34, and so on, where each number (from the third on) is the sum of the previous two. Create 
a method that takes an integer as an argument and displays that many Fibonacci numbers 
starting from the beginning, e.g., If you run java Fibonacci 5 (where Fibonacci is the 
name of the class) the output will be: 1, 1, 2, 3, 5. 
*******************************/
import java.util.*;
import static net.mindview.util.Print.*;
import static net.mindview.util.Range.*;

public class E09{
	public static void main(String[] args){
		Random rand=new Random();
		int length=rand.nextInt(20)+2;
		int n1,n2,n;
		n1=n2=1;
		print("Fibonacci:	"+length);
		print(1+":	"+1);
		print(2+":	"+1);
		for(int i:range(length-2)){
				n=n1+n2;
				n1=n2;
				n2=n;
				print(i+3+":	"+n);
		}
	}
}