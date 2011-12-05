//: 5/E20.java

/************E20************
 (1) Create a main( ) that uses varargs instead of the ordinary main( ) 
syntax. Print all the elements in the resulting args array. Test it with various numbers of 
command-line arguments.
**************************/
public class E20{
	public static void main(Object...args){
		for(Object obj:args)
			System.out.println(obj);
	}
}

//! ERROR