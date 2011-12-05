public class DataOnly{
	int i;
	double d;
	boolean b;
	
	void reset(){
		i=6;
		d=9.0;
		b=true;
	}
	void set(){
		i=0;
		d=2.8;
		b=false;
	}
	void show(){
		System.out.println(i);
		System.out.println(d);
		System.out.println(b);
	}
	public static void main(String[] args){
		DataOnly data=new DataOnly();
		data.set();
		data.show();
		data.reset();
		data.show();
	}
}