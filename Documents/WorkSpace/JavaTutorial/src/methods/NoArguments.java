package methods;

public class NoArguments {

	public static void main(String[] args) {
		
		//calling by the name of the method 
		Add();
		Sub();
		
	}
	public static void Add() {
		
		int x = 10;
		int y = 10;
		int c = x+y;
		System.out.println(c);
		
	}
public static void Sub() {
	
	int x = 5;
	int y = 2;
	int z = x-y;
	
	System.out.println(z);
}
}
