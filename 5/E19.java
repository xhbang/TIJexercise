//: 5/E19.java
/*************E19************
 (2) Write a method that takes a vararg String array. Verify that you can 
pass either a comma-separated list of Strings or a String[] into this method. 
****************************/
import static net.mindview.util.Print.*;

public class E19{

	static void printStrings(String[] strs){
		for(String str:strs)
			print(str+" ");
		print("first");
	}
	
/*
	static void printStrings(String... args){
		for(String str:args)
			print(str+" ");
		print("seond");
	}
*/	
	public static void main(String args[]){
		printStrings(new String[]{"c","b","a"});
		printStrings("a","b","c");
	}
	
}