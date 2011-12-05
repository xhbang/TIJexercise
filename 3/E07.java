//: 3/E07.java

/**********Exercise 7*************
Exercise 7:   (3) Write a program that simulates coin-flipping
*********************************/
import java.util.*;
import static net.mindview.util.Print.*;

public class E07{
	public static void main(String[] args){
		int i=0,up=0,down=0;
		Random rand=new Random();
		while(i<100){
			if(rand.nextInt(100)%2==0)
				up++;
			else
				down++;
			i++;
		}
		print("up times: "+up);
		print("down times: "+down);
	}
}