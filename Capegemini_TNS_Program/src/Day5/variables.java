package Day5;

public class variables {
	int r=23;//Instance variable
	static int g=25;//static variable

	public static void main(String[] args) {
	int f=28;
	System.out.println(f);//local
	System.out.println(g);//global
	variables test=new variables();
	System.out.println(test.r);//instance
		
		
		

	}

}
