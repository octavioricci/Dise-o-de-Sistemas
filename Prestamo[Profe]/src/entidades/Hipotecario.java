package entidades;

public class Hipotecario {
	
	private static final String MENSAJE_ERROR = "No aplica para este credito.  Cuota superior al [%s] porciento";
	private double interes = 30;
	private double porcentualSueldo = 40;
	
	public double pedirPrestamo(int monto, int cuotas, int sueldo) throws Exception {
		
		double cuota = monto * (1 + interes / 100) / cuotas;
		
		if( sueldo * (porcentualSueldo / 100) < cuota) {
			throw new Exception(String.format(MENSAJE_ERROR, porcentualSueldo));
		}
		
		return cuota;
		
	}
}
