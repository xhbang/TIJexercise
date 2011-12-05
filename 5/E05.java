//: 5/E05.java

/************Exercise 5************
  (2) Create a class called Dog with an overloaded bark( ) method. This 
method should be overloaded based on various primitive data types, and print different types 
of barking, howling, etc., depending on which overloaded version is called. Write a main( ) 
that calls all the different versions.  
**********************************
  (1) Modify the previous exercise so that two of the overloaded methods have 
two arguments (of two different types), but in reversed order relative to each other. Verify 
that this works. 
********************************/
import static net.mindview.util.Print.*;

class Dog{
	void bark(int i,double d){
		print("int bark!");
	void bark(double d,int i){
	}
		print("double bark");
	}
	void bark(char c){
		print("char bark!");
	}
}

public class E05{
	public static void main(String[] args){
		Dog dog=new Dog();
		dog.bark(1);
		dog.bark(1.0);
		dog.bark('1');
	}
}