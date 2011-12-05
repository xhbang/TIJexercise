//:Java/Doc.java
import java.util.*;

/**The example of javadoc
 *Display a string and today's date.
 *@anthor Hang Xie
 *@auther ikari.blogbus.com
 *@version 0.1
*/
public class HelloDoc{
	/**Entry point to class& application.
	 *@para args array of string argument.
	 *@throws exception:No exception throw
	*/
	public static void main(String[] args){
		System.out.println("Hello,Doc: ");
		System.out.println(new Date());
	}
}	/*Output:(55% match)
Hello,Doc: 
Wed Oct 05 14:39:36 MDT 2010
*///:~