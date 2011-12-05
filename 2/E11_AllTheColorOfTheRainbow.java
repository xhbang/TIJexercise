//:2/E11_AllTheColorOfTheRainbow.java
//+M java AllTheColorOfTheRainbow
public class E11_AllTheColorOfTheRainbow{
	int anIntegerRepresentingColors=0;
	void changeTheHueOfTheColor(int newHue){
		anIntegerRepresentingColors=newHue;
		System.out.println("Color changed to "+anIntegerRepresentingColors);
	}
	void showColor(){
		System.out.println("Color is : "+anIntegerRepresentingColors);
	}
	public static void main(String[] args){
		E11_AllTheColorOfTheRainbow rainbow=new E11_AllTheColorOfTheRainbow();
		rainbow.showColor();
		rainbow.changeTheHueOfTheColor(5);
		rainbow.showColor();
	}
}///:~