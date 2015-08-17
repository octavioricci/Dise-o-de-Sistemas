
public class Division implements OperacionAritmetica{

	public void operar(int num1,int num2){
		
		if(num2 == 0){
			System.out.println("No puede divirse por 0, da infinito");
		}
		else
			System.out.println("División->: "+(num1/num2));
	}
}
