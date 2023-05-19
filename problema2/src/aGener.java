//BERNARDO MARCO BORGARO
//ITAM
public class aGener {
	
	public static <T> void genericoT (T[] arreglo, T dato){
		 for (int i=0; i< arreglo.length; i++) {
			 if (dato.equals(arreglo[i])) {
				 for (int j=i; j<arreglo.length; j++) {
					arreglo[i]=dato; 
					i++;
				 }
			 }
		 }
	}

}
