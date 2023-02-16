package Day8;

class Rules {
	int maxspeed=60;
}
	class selto extends Rules{
		int maxspeed=170;
		void disp(){
			System.out.println("speed is:"+super.maxspeed);
		}
	}
public class NashikRules{
	public static void main(String[] args) {
		selto obj=new selto();
		obj.disp();

	}

}
