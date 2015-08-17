
public class PoliciaBueno implements DetencionPolicial {
	private final int MAXIMA_VELOCIDAD=140;
	
	public void multa(int velocidad, int coima){
		
		
		if(coima != 0){
			System.out.println("POLICIA BUENO-> NO ME INTERESA A LA VELOCIDAD QUE IBA, INTENTÓ COIMEARME!! IRÁ DETENIDO !!!");
		}
		
		if(velocidad > MAXIMA_VELOCIDAD && coima == 0){
			System.out.println("POLICIA BUENO-> A pesar de ser permisivo,se ha sobrepasado en EXCESO de los "+MAXIMA_VELOCIDAD+" permitidos");
		}
		
		if (velocidad < MAXIMA_VELOCIDAD && coima ==0){
			System.out.println("POLICIA BUENO-> Todo bien, no pasa nada, siga");
		}
	
		
	}
}
