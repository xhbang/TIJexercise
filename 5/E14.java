//: 5/E14.java

/*******E14***********
 (1) Create a class with a static String field that is initialized at the point of 
definition, and another one that is initialized by the static block. Add a static method that 
prints both fields and demonstrates that they are both initialized before they are used.  
********************/

import static net.mindview.util.Print.*;

class Test{
	static String a;
	void  f(){
		print(a);
	}
}	

class Test2{
	static String b;
	static{
		b=" shit";
	}
	void  f(){
		print(b);
	}
}
public class E14{
	public static void main(String[] args){
		Test a=new Test();
		Test2 b=new Test2();
		a.f();
		b.f();
	}
}