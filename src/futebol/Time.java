package futebol;

import java.util.ArrayList;
import java.util.List;

public class Time {
	private String nome, serie;
	private Escalacao escalacao;
	private Treinador treinador;
	private List<Jogador> contratados;
	
	public Time(String nome, String serie, Escalacao escalacao, Treinador treinador, List<Jogador> contratados) {
		super();
		this.serie = serie;
		this.nome = nome;
		this.escalacao = escalacao;
		this.setTreinador(treinador);
		this.setContratados((contratados != null) ? contratados : new ArrayList<>());
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Escalacao getEscalacao() {
		return escalacao;
	}
	public void setEscalacao(Escalacao escalacao) {
		this.escalacao = escalacao;
	}
	public Treinador getTreinador() {
		return treinador;
	}
	public void setTreinador(Treinador treinador) {
		this.treinador = treinador;
	}
	public List<Jogador> getContratados() {
		return contratados;
	}
	public void setContratados(List<Jogador> contratados) {
		this.contratados = contratados;
	}
	public void contratar(Jogador jogador) {
		if (!this.contratados.contains(jogador)) {
			this.contratados.add(jogador);
        }
	}
	public void demitir(Jogador jogador) {
		if (this.contratados.contains(jogador)) {
			this.contratados.remove(jogador);
        }
	}
	@Override
	public String toString() {
		return "\n ☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵ TIME ☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵ \n Nome: " + nome + "\n Série: " + serie + "\n \n ☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵ TREINADOR ☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵" + treinador + "\n \n ☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵ ESCALAÇÃO ☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵" + this.escalacao + "\n";
	}
	
}
