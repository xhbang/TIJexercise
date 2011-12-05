//: 3/E10.java

/*****************Exercise 10**************
 (3) Write a program with two constant values, one with alternating binary 
ones and zeroes, with a zero in the least-significant digit, and the second, also alternating, 
with a one in the least-significant digit (hint: It’s easiest to use hexadecimal constants for 
this). Take these two values and combine them in all possible ways using the bitwise 
operators, and display the results using Integer.toBinaryString( ). 
******************************************/

import static net.mindview.util.Print.*;

public class E10{
	public static void main(String[] args){
		int a=0x2544;	//0010 0101 0100 0100
		int b=0x3B4A;	//0011 1011 0010 1010
		print("a:	"+Integer.toBinaryString(a));
		print("b:	"+Integer.toBinaryString(b));
		int x=a|b;
		print("OR:	"+Integer.toBinaryString(x));
		x=a&b;
		print("AND:	"+Integer.toBinaryString(x));
		x=a^b;
		print("XOR:	"+Integer.toBinaryString(x));
		x=~a;
		print("NOT:	"+Integer.toBinaryString(x));
		x=~b;
		print("NOT b:	"+Integer.toBinaryString(x));
	}
}
/*Output
*我有一点疑惑啊！！

Sonic@sonix /cygdrive/r
$ javac E10.java
E10.java:15: 非法的表达式开始
                static int a=0x2544;    //0010 0101 0100 0100
                ^
E10.java:16: 非法的表达式开始
                static int b=0x3B4A;    //0011 1011 0010 1010
                ^
2 错误

Sonic@sonix /cygdrive/r
$ java E10
a:      10010101000100
b:      11101101001010
OR:     11111101001110
AND:    10000101000000
XOR:    1111000001110
NOT:    11111111111111111101101010111011
NOT b:  11111111111111111100010010110101

Sonic@sonix /cygdrive/r
$ java E10
*/