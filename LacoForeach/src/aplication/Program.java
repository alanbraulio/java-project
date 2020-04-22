package aplication;

public class Program {
	

	public static void main(String[] arg) {
		
		String vect[] = new String [] {"Maria", "Bob", "Alex"};
		
		for(int i=0; i < vect.length; i++) { // For normal
			System.out.println(vect[i]);
		}
		
		for(String obj : vect) { // Foreach
			System.out.println(obj);
		}

}

}