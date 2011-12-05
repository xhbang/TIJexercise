//: 5/E08.java

/*************Exercise ***************
 (1) Create a class with two methods. Within the first method, call the second 
method twice: the first time without using this, and the second time using this¡ªjust to see it 
working; you should not use this form in practice. 
************************************/

import static net.mindview.util.Print.*;

public class E08{
	void firstMethod(){
		print("First");
		secondMethod();
		this.secondMethod();
	}
	void secondMethod(){
		print("Second");
	}
	public static void main(String[] args){
		E08 app=new E08();
		app.firstMethod();
	}
}