
public class Piedra implements Elemento{

	public String jugar(Piedra piedra){
		return "Empataron!, Ambos son piedra";
	}
	
	public String jugar(Papel papel){
		return "Gan� jugador2->papel, perdi� jugador1->piedra";
	}
	
	public String jugar(Tijera tijera){
		return "Gan� jugador1->piedra, perdi� jugador2->tijera";
	}
	
	public String jugar(Elemento e){
		return e.jugar(this);
	}
}
