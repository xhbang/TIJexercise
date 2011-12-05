import static net.mindview.util.Print.*;

public class Test{
	public static void main(String[] args){
		short s=32767;
		print(Integer.toBinaryString(s));
		short ss=0x7fff;
		print(Integer.toBinaryString(ss));
		int i1=0xffffffff;
		print(i1);
//		print(Integer.toBinaryString(i));
		int i2=0x80000000;
		print(i2);
		int i3=0x7fffffff;
		print(i3);
	}
}