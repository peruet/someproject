package someproject.trying;

public class CSomeClass {
	
	int a = 0;
	String b = null;
	
	CSomeClass() {
		a = 0;
		b = "";
	}
	
	CSomeClass(int aa, String bb) {
		if(bb == null) b = "";
		else b = new String(bb);
		
		a = aa;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Try this! And that");
		
	}

}
