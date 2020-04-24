package prueba;

public class prueba {
	
	public static void main (String[]args) {
		
	Nif minif = new Nif(51179564,'X'); 

	System.out.println(minif.getDni()+ "-"+minif.getLetra()); 

	minif.setLetra('U'); 

	System.out.println(minif.getDni()+ "-"+minif.getLetra());
		
	minif.setLetra('D'); 
	}	 
}
