package Day5;

public class nett {

	private int rollno; public void setrollno (int sub){ this.rollno = sub;

	}

	public int getrollno()

	{
		return rollno;
	}

	public static void main(String[] args) { nett f = new nett();

	f.setrollno (7);

	f.setrollno (44); f.setrollno (63);

	f.setrollno(49);

	f.setrollno(46);

	System.out.println(f.getrollno());
		

	}

}
