package Day4;

public class Base {
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varprotected=40;
	
	void methodDefault()
	{
		System.out.println("Default acess Base class");
		System.out.println("Default variable:"+varDefault);
	}
	public void methodPublic(){
		System.out.println("public access Base class");
		System.out.println("public variable:"+varPublic);
   }
   private void methodPrivate(){
	   System.out.println("public access Base class");
	   System.out.println("public variable:"+varPrivate);
   }
   protected void methodprotected(){
	   	System.out.println("public access Base class");
	   	System.out.println("public variable:"+varprotected);
   }
}