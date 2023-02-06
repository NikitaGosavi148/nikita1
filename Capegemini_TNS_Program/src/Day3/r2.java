package Day3;

public class r2 extends r1 {
	public void j1(int o,String q){
		System.out.println("Method Overriding");
	}

	public static void main(String[] args) {
		r2 u=new r2();
		u.j1(62,"Sky");
		u.j1(61,"Sky");
	}

}
