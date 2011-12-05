//: 4/E07.java
/**********Exercise 7**********
   (1) Modify Exercise 1 so that the program exits by using the break keyword 
at value 99. Try using return instead.  
******************************/
import static net.mindview.util.Range.*;
import static net.mindview.util.Print.*;

public class E07{
	public static void main(String [] args){
		for(int i:range(100)){
			if(i==99)
				return;
			if(i%10!=0)
				continue;
			printnb(i+" ");
		}
		return;
	}
}