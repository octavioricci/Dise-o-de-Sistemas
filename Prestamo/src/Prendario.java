
public class Prendario implements Prestamo {

	private int cuota;
	
	
	
	
	
	public int getCuota() {
		return cuota;
	}




	public void setCuota(int cuota) {
		this.cuota = cuota;
	}



	

	public String darPrestamo(float monto,float sueldo, int cuotas) {
		
		cuota = (int)((monto * 1.2) / cuotas);
		
				
		if(cuota < (sueldo * 0.3)){
	

			return "Se otorg� el prestamo hipotecario\n"+"Sueldo: "+sueldo+"\nInteres final: "+(monto*1.2)+"\nPesos x Cuota que debe pagar: "+getCuota()+"\nCuota seg�n su sueldo que puede pagar: "+sueldo*0.4+"\nCantidad de Cuotas: "+cuotas;			
		}
		
		else
			return "No se autoriz� el prestamo\n"+"Pesos x Cuota que debe pagar: "+getCuota()+"\nSu cuota seg�n su sueldo que puede pagar: "+sueldo*0.3;
	}	


}
