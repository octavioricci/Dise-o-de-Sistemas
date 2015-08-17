
public class Main {

		public static void main (String[] args){
			
			//Resta resta = new Resta();
			//Numeros numeros = new Numeros(resta);
			//numeros.haceLaCuenta(9, 8);
			
			
		////// MEJOR FORMA////////
			
			
			Numeros numeros = new Numeros(new Division());
			numeros.haceLaCuenta(8, 2);
			
			numeros = new Numeros(new Suma());
			numeros.haceLaCuenta(8, 2);
			
			numeros = new Numeros(new Multiplicacion());
			numeros.haceLaCuenta(8, 2);
			
			numeros = new Numeros(new Resta());
			numeros.haceLaCuenta(8, 2);
			
			
			
			
			
			
			
		}
}
