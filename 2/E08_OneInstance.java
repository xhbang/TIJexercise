//2:E08_OneInstance.java
//+M java OneInstance
/************Exercise**************
 Write a program that demonstrates that, no matter how many objects you create of a particular class, there is only one instance of a particular static field in that 
class.  
**********************************/
class One{
	static int i=214;
	static void incr(){
		i++;
	}
}

public class E08_OneInstance{
	static void incr(){
		One.i++;
	};
	public static void main(String[] args){
		One a=new One();
		One b=new One();
		One c=new One();
		E08_OneInstance oi=new E08_OneInstance();
		System.out.println(a.i);
		System.out.println(b.i);
		System.out.println(c.i);
		System.out.println(One.i);
		a.incr();
		System.out.println(a.i);
		System.out.println(b.i);
		System.out.println(c.i);
		System.out.println(One.i);
		b.incr();
		System.out.println(a.i);
		System.out.println(b.i);
		System.out.println(c.i);
		System.out.println(One.i);
		c.incr();
		System.out.println(a.i);
		System.out.println(b.i);
		System.out.println(c.i);
		System.out.println(One.i);
		One.incr();
		System.out.println(a.i);
		System.out.println(b.i);
		System.out.println(c.i);
		System.out.println(One.i);;
	}
}