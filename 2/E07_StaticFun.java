//2:E07_StaticFun.java
//+M java E07_StaticFun
/*************************Exercise 7***************
Turn the Incrementable code fragments into a working program. 
**************************************************/

class Incrementable{
	static int i=214;
}

public class E07_StaticFun{
	static void incr(){
		Incrementable.i++;
	}
	
	public static void main(String[] args){
		E07_StaticFun sf=new E07_StaticFun();
		System.out.println(Incrementable.i);
		sf.incr();
		System.out.println(Incrementable.i);
		E07_StaticFun.incr();		//我想把结果打印出来
		System.out.println(Incrementable.i);
	}
}	///:~