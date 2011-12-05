//: 3/E14.java
/*************Exercise 14***********
 (3) Write a method that takes two String arguments and uses all the 
boolean comparisons to compare the two Strings and print the results. For the == and !=, 
also perform the equals( ) test. In main( ), call your method with some different String 
objects. 
***********************************/
import static net.mindview.util.Print.*;
public class E14{
	static void compareString(String a,String b){
//		print("~a:	"+~a);
//		print("a&&b:	"+a&&b);
//		print("a||b:	"a||b);
		print("a==b:	"+a==b);
		print("a!=b:	"+a!=b);
		
	}
	public static void main(String[] args){
		if(args.length==2){
			print(args[0]+"\n"+args[1]);
			compareString(args[0],args[1]);
			print("a==b?:	"+args[0].equals(args[1]));
		}
		else{
			print("length of args is wrong");
			System.exit(1);
		}
	}

}