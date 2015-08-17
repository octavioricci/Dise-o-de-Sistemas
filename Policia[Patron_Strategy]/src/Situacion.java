
public class Situacion {

	DetencionPolicial detencion;
	
	public Situacion(DetencionPolicial d){
		this.detencion = d;
	}
	
	public void determinarMulta(int velocidad, int coima){
		detencion.multa(velocidad, coima);
	}
}
