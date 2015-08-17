
public class Prendario extends Prestamo {
	

	public Prendario(int sueldo) {
		super(sueldo);
	}

	public void damePrestamo(int sueldo){
		this.cuota = sueldo*0.3;
		this.interes = cuota*0.2;
	}

}
