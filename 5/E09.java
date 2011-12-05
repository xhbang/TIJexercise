//: 5/E09.java
/**********Exercise 9************
 (1) Create a class with two (overloaded) constructors. Using this, call the 
second constructor inside the first one.  
*******************************/

import static net.mindview.util.Print.*;

public class E09{
	E09(){
		this(200l);		//必须放到第一位
		print("E09 at first snight!");		
	}
	E09(long longtime){
		print("A long love");
	}
	public static void main(String[] args){
		E09 love=new E09();
	}
}