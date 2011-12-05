//: 4/E05.java

/************Exercise 5*************
 (4) Repeat Exercise 10 from the previous chapter, using the ternary operator 
and a bitwise test to display the ones and zeroes, instead of Integer.toBinaryString( ). 

*****************Exercise 10**************
 (3) Write a program with two constant values, one with alternating binary 
ones and zeroes, with a zero in the least-significant digit, and the second, also alternating, 
with a one in the least-significant digit (hint: It?ˉs easiest to use hexadecimal constants for 
this). Take these two values and combine them in all possible ways using the bitwise 
operators, and display the results using Integer.toBinaryString( ). 
******************************************/
/*numberOfLeadingZeros(int i) 
          在指定 int 值的二进制补码表示形式中最高位（最左边）的 1 位之前，返回零位的数量。
*/
import static net.mindview.util.Print.*;


public class E05{
	public static void main(String[] args){
		int a=0x59f35bca;
//		Random rand=new Random();
//		int a=rand.nextInt();
		int b=0x7cb38a1d;
		print(Integer.toBinaryString(a));
		bitPrint(a);
		print(Integer.toBinaryString(b));
		bitPrint(b);
		print(Integer.toBinaryString(a&b));
		bitPrint(a&b);
		print(Integer.toBinaryString(a|b));
		bitPrint(a|b);
		print(Integer.toBinaryString(a^b));
		bitPrint(a^b);
		print(toUnsignedString(a^b,1));			//最后一个是官方做法
	
	}
	static void bitPrint(int i){
		int count=Integer.numberOfLeadingZeros(i);
		i<<=count;
		for(int j=0;j<32-count;j++){
			int n=Integer.numberOfLeadingZeros(i)==0?1:0;
			System.out.print(n);
			i<<=1;
		}
		System.out.println("");
	}
	 /**
     * Official Convert the integer to an unsigned number. 		!!!shift=1,toBinary
     */
	 
	public static String toUnsignedString(int i, int shift) {
		char[] buf = new char[32];
		int charPos = 32;
		int radix = 1 << shift;
		int mask = radix - 1;
		do {
			buf[--charPos] = digits[i & mask];
			i >>>= shift;
		} while (i != 0);

		return new String(buf, charPos, (32 - charPos));
	}
	final static char[] digits = {
	'0' , '1' , '2' , '3' , '4' , '5' ,
	'6' , '7' , '8' , '9' , 'a' , 'b' ,
	'c' , 'd' , 'e' , 'f' , 'g' , 'h' ,
	'i' , 'j' , 'k' , 'l' , 'm' , 'n' ,
	'o' , 'p' , 'q' , 'r' , 's' , 't' ,
	'u' , 'v' , 'w' , 'x' , 'y' , 'z'
    };
	
	
}