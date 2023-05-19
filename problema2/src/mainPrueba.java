//BERNARDO MARCO BORGARO
//ITAM

public class mainPrueba {

	public static void main(String[] args) {
		Integer[] arreglo1s= {1, 2, 3, 3};
		String[] arreglo2s= {"uno", "uno", "dos", "tres"};
		Double[] arreglo3s= {1.6, 2.7, 3.1, 3.0};
		
		// DATO QUE SI SE ENCUENTRA
		aGener.genericoT(arreglo2s, "uno");
		for (int i= 0; i<arreglo2s.length; i++) {
			System.out.println(arreglo2s[i]);
		}
		
		System.out.println();
		System.out.println();
		//DATO QUE NO SE ENCUENTRA
		aGener.genericoT(arreglo3s, "3.9");
		for (int i= 0; i<arreglo3s.length; i++) {
			System.out.println(arreglo3s[i]);
		}
		
		
	}

}
