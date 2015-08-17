
public class EstrategiaTarjetaCredito implements EstrategiaDePago {

	private int nroTarjeta;
	private int clave;
	private String nombre;
	private String fechaVencimiento;
	
	public EstrategiaTarjetaCredito(String nombre,int nroTarjeta,int clave,String fechaVencimiento){
		this.nombre = nombre;
		this.nroTarjeta = nroTarjeta;
		this.clave = clave;
		this.fechaVencimiento = fechaVencimiento;
	}
	
	public void pagar(int monto){
		System.out.println(monto +" pagado con tarjeta de crédito");
	}
}
