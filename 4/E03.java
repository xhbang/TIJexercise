//: 4/E03.java

/***********Exercise 3************
  (1) Modify Exercise 2 so that your code is surrounded by an ¡°infinite¡± while 
loop. It will then run until you interrupt it from the keyboard (typically by pressing Control-
C).  
********************************/

import java.util.*;
import static net.mindview.util.Print.*;

public class E03{
	public static void main(String[] args){
		int value,value2;
		Random rand1=new Random();
		Random rand2=new Random();
		while(true){
			value=rand1.nextInt(100);
			value2=rand2.nextInt(100);
			/*?????????
			(value>=vlaue2)
			?(print(value+">="+value2))
			:(print(value+"<="+value2));
			*/
			if(value>value2)
				print(value+"	>	"+value2);
			else if(value==value2)
				print(value+"	=	"+value2);
			else
				print(value+"	<	"+value2);
		}
	}
}