
public class Numeros {

	OperacionAritmetica operacion;
	
	public Numeros(OperacionAritmetica operacion){
		this.operacion = operacion;
	}
	
	public void haceLaCuenta(int numero1,int numero2){
		
		operacion.operar(numero1, numero2);
	}
	
}
