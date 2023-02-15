package Day4;

public class se {
	public void s1(int a,String b){
	System.out.println("Overloading Method");
	}
	public void s1(String e,int g){
	System.out.println("Method Overloading");
	}
	public static void main(String[] args){
		se h=new se();
		h.s1(12,"Swa");   	//1st method
		h.s1("Swa",12);		//2nd method
		
	}
}
