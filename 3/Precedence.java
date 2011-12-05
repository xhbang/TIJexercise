//: 3/Precedence.java
import static net.mindview.util.Print.*;		//remember static!!!

public class Precedence{
	public static void main(String[] args){
		int a=1,b=2,c=4,x,y;
		x=a+b-2/2+c;
		y=a+(b-2)/(2+c);
		print("x is : "+x);
		print("y is : "+y);
	}
}/*Output
x=6 y=1
*///:~