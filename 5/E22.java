//: 5/E22
/*********E21 &E22***********
Exercise 21:   (1) Create an enum of the least-valuable six types of paper currency. Loop 
through the values( ) and print each value and its ordinal( ).  
Exercise 22:   (2) Write a switch statement for the enum in the previous example. For 
each case, output a description of that particular currency.  
**************************/
import static net.mindview.util.Print.*;

enum Paper{
	RMB,DOLLER,EURO,MILU
}

class Currency{
	Paper kind;
	Currency(Paper newkind){this.kind=newkind;}
	void about(){
		switch(kind){
			case RMB:
				print("this is used in china");
				break;
			case DOLLER:
				print("thisi is usd in us");
				break;
			case EURO:
				print("this is used in europ");
				break;
			case MILU:
				print("this is shit");
		}
	}
}

public class E22{
	public static void main(String[] args){
		Currency 
			a=new Currency(Paper.RMB),
			b=new Currency(Paper.DOLLER),
			c=new Currency(Paper.EURO),
			d=new Currency(Paper.MILU);
		print(a+" "+a.kind.ordinal());
		a.about();
		print(b+" "+b.kind.ordinal());
		b.about();
		print(c+" "+c.kind.ordinal());
		c.about();
		print(d+" "+d.kind.ordinal());
		d.about();
	}
}

