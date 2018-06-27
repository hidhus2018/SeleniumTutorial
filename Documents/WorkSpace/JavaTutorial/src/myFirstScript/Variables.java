package myFirstScript;

public class Variables {
     
	//Global variables
	static int x = 5;
	static String c = "Hello";
	
	
	public static void main(String[] args) {
		
		//calling method name under main method
		ABC();
		
		//Local variables
		int a =55;
		String b = "Hello";
		System.out.println(a+" "+b );
	}
	public static void ABC() {
		int x = 10;
		String c = "Hello";
		
		System.out.println(x+ " "+c); 
	
				
	}

}
