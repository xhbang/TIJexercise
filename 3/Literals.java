//: 3/Literals.java
import static net.mindview.util.Print.*;

public class Literals{
	public static void main(String[] args){
		int i1=0x2f;	//lower case
		print("i1: "+Integer.toBinaryString(i1));
		int i2=0x2F;	//upper case
		print("l2: "+Integer.toBinaryString(i2));
		int i3=0177;	//leading zero
		print("l3: "+Integer.toBinaryString(i3));
		char c=0xffff;		//max char hex value
		print("c: "+Integer.toBinaryString(c));
		byte b=0x7f;	//max byte hex value;
		print("b: "+Integer.toBinaryString(b));
		short s=0x7fff;	//max short hex value
		print("s: "+Integer.toBinaryString(s));
		long n1=200L;	//long suffix
		long n2=200l;	//long suffix(confused)
		long n3=200;
		print("long: "+Long.toBinaryString(n1));
		print("long: "+Long.toBinaryString(n2));
		print("long: "+Long.toBinaryString(n3));
		//all the same answer;
		float f1=1;
		float f2=1F;
		float f3=1f;	//float suffix
		double d1=1d;	//double suffix
		double d2=1D;	//double suffix;
		
		char c1=5,c2='t';
		print("c1+c2\t"+c1+c2);		//5 charge to char type
	}
}