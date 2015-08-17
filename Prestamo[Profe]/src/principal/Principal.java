package principal;

import entidades.Prendario;

public class Principal {

	public static void main(String[] args) {
		Prendario prestamo =  new Prendario();
		
		pedirPrestamo(prestamo, 100000, 12, 10000);
		pedirPrestamo(prestamo, 100000, 120, 10000);

	}

	private static void pedirPrestamo(Prendario prestamo, int monto, int cuotas, int sueldo) {
		try {
			System.out.println("Su cuota es de: " + prestamo.pedirPrestamo(monto, cuotas, sueldo));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
