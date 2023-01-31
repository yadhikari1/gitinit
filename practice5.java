package one;

public class practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//variables 
		System.out.println("a and b are the 2 variables");
	int a=10;
	int b=20;
	System.out.println(a+b);
	
	
	//Arithmetic operator
	System.out.println("Aruthmetic operator");
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);
	
	System.out.println("function without parameter and without return type");
	CalA();
	
	System.out.println("function with parameter without return type");
	CalB(20,30);
	
	System.out.println("function with parameter with return type");
	
	int Add=CalC(5,4);
	System.out.println(Add);
	int Add1=CalC(10,2);
	System.out.println(Add1);
	System.out.println(Add+Add1);
	
	
	
	}
	//creating the function function without parameter without return type line 24
	static void CalA() {
		System.out.println(10+20);
	}
	
	//creating the function with parameter without return type line 27
	static void CalB(int c, int d) {
		System.out.println(c+d);
	}
	
	//creating the function with parameter with return type line 30
	static int CalC(int e, int f) {
		return e+f;
		
	}

}
