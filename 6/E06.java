/************E06***************
Exercise 6:   (1) Create a class with protected data. Create a second class in the same file 
with a method that manipulates the protected data in the first class.  
*****************************/
import static net.mindview.util.Print.*;

class A{
	A(){
		print("A construct");
	}
	protected int a=78;
	void showa(){
		print("a is:\t"+a);
	}
}

public class E06{
	static void change(A x,int y){
		x.a=y;
	}
	public static void main(String[] args){
		A test=new A();
		test.showa();
		change(test,9);
		test.showa();
	}
}