package methods;

public class NonStatic {

	public static void main(String[] args) {
		
		//Calling Nonstatic method inside main method, we have to create object of the class.  
		NonStatic obj = new NonStatic();
		obj.Add();
		obj.Sub();

	}
    public void Add() {
		
		int x = 10;
		int y = 10;
		int c = x+y;
		System.out.println(c);
		
	}
    public void Sub() {
	
	int x = 5;
	int y = 2;
	int z = x-y;
	
	System.out.println(z);
}

}
