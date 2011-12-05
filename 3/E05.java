// 3/E05.java
/*******************Exercise 5&6********************
Exercise 5:   (2) Create a class called Dog containing two Strings: name and says. In 
main( ), create two dog objects with names ¡°spot¡± (who says, ¡°Ruff!¡±) and ¡°scruffy¡± (who 
says, ¡°Wurf!¡±). Then display their names and what they say.  
Exercise 6:   (3) Following Exercise 5, create a new Dog reference and assign it to spot¡¯s 
object. Test for comparison using == and equals( ) for all references. 
***************************************************/
import static net.mindview.util.Print.*;

class Dog{
	String name,says;
}
public class E05{
	public static void main(String[] args){
		Dog a=new Dog();
		Dog b=new Dog();
		a.name="spot";
		a.says="Ruff!";
		b.name="scruffy";
		b.says="Wurf!";
		Dog c=new Dog();
		c=a;
		print(a==b);
		print(a==c);
		
		print(a.equals(b));
		print(a.equals(c));
		Dog d=new Dog();			//content=a
		d.name="spot";
		d.says="Ruff!";
		print(a==d);
		print(a.equals(d));		//false
		
	}
}