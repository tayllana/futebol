package futebol;

import java.util.ArrayList;
import java.util.List;

public class Escalacao {
	private List<Jogador> titular;
	private List<Jogador> reserva;
	
	public Escalacao(List<Jogador> titular, List<Jogador> reserva) {
		super();
        this.titular = (titular != null) ? titular : new ArrayList<>();
        this.reserva = (reserva != null) ? reserva : new ArrayList<>();
	}

	public void addTitular(Jogador jogador) {
		// Tira do banco e põe para jogo
		if(!reserva.isEmpty()) {
			reserva.remove(jogador);	
		}
		titular.add(jogador);
	}

	public void removerTitular(Jogador jogador) {
		// Tira do jogo e põe no banco
		if (!titular.isEmpty()) {
			titular.remove(jogador);	
		}
		reserva.add(jogador);
	}

	@Override
	public String toString() {
		return " \n Titular: " + titular + "\n Reserva:" + reserva + "\n";
	}
	
}
