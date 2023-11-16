package futebol;

public class Time {
	private String nome, serie;
	private Escalacao escalacao;
	private Treinador treinador;
	
	public Time(String nome, String serie, Escalacao escalacao, Treinador treinador) {
		super();
		this.serie = serie;
		this.nome = nome;
		this.escalacao = escalacao;
		this.setTreinador(treinador);
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
	@Override
	public String toString() {
		return "\n \n Nome: " + nome + "TIME \n Série: " + serie + "\n \n TREINADOR" + treinador + "\n \n ESCALAÇÃO" + escalacao + "\n";
	}
	
}
