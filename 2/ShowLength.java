public class ShowLength{

	static int storage(String s){	//为甚呢一定静态方法
		return s.length()*2;
	}	
	public static void main(String[] args){
		String a=new String("fuck");
		String b=new String("you");
		System.out.println(a);
		System.out.println("the storage of a :"+storage(a));
		System.out.println(b);
		System.out.println("the storage of b :"+storage(b));
	}
}