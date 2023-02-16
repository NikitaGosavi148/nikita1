package Day6;

public abstract class MumbaiRules {

	 abstract void speedlimit();
	    abstract void rashdriving();
	    abstract void rule();
	}
	class seltos extends MumbaiRules{
	    public static void main(String[] args) {
	        seltos obj = new seltos();
	        obj.rashdriving();
	        obj.rule();
	        obj.speedlimit();
	    }

	    @Override
	    void speedlimit() {
	        System.out.println("speed should not more than 60 km/hr");
	    }

	    @Override
	    void rashdriving() {
	        System.out.println("alert voice");
	    }

	    @Override
	    void rule() {
	        System.out.println("go slow");
	    }
	
		

	}

