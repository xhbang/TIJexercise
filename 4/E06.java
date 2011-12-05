//: 4/E06.java
/********Exercise 6************
  (2) Modify the two test( ) methods in the previous two programs so that 
they take two extra arguments, begin and end, and so that testval is tested to see if it is 
within the range between (and including) begin and end.
******************************/
import static net.mindview.util.Print.*;

public class E06{
	static boolean test(int testval,int begin,int end){
		if(testval>=begin &&testval<=end)
			return true;
		return false;
	}
	public static void main(String[] args){
		if(test(6,3,8))
			print("in");
	}
}