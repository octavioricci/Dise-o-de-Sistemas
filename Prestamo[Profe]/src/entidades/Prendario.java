package entidades;

public class Prendario {

	private static final String MENSAJE_ERROR = "No aplica para este credito.  Cuota superior al [%s] porciento";
	private double interes = 20;
	private double porcentualSueldo = 30;
	
	public double pedirPrestamo(int monto, int cuotas, int sueldo) throws Exception {
		double cuota = monto * (1 + interes / 100) / cuotas;
		
		if( sueldo * (porcentualSueldo / 100) < cuota) {
			throw new Exception(String.format(MENSAJE_ERROR, porcentualSueldo));
		}
		
		return cuota;
		
	}
}
