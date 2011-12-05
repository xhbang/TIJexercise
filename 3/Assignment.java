//: 3/Assignment.java
import static net.mindview.util.Print.*;

class Test{
	int data;
}

public class Assignment{
	public static void main(String[] args){
		Test t1=new Test();
		Test t2=new Test();
		t1.data=23;
		t2.data=56;
		print("t1 is : "+t1.data);
		print("t2 is : "+t2.data);
//		t1=t2;
		t1.data=t2.data;
		print("t1 is : "+t1.data);
		print("t2 is : "+t2.data);
		t1.data=214;
		print("t1 is : "+t1.data);
		print("t2 is : "+t2.data);
	}
}