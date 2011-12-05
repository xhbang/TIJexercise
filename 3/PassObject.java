//: 3/PassObject.java
import static net.mindview.util.Print.*;

class Letter{
	char ch;
}

public class PassObject{
	static void fun(Letter c){
		c.ch='y';
	}
	public static void main(String[] args){
		Letter l1=new Letter();
		l1.ch='x';
		print("letter is: "+l1.ch);		//be ware of l1
		fun(l1);
		print("letter after change : "+l1.ch);
	}

}