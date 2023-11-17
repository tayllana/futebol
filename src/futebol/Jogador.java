package futebol;

public class Jogador extends Pessoa{
	private String tamanhoUniforme, posicao;
	private int numeroCamisa, golsTotais;
	
	public Jogador(String nome, String endereco, String nascimento, String cpf, double telefone, String tamanhoUniforme,
			String posicao, int numeroCamisa, int golsTotais) {
		super(nome, endereco, nascimento, cpf, telefone);
		this.tamanhoUniforme = tamanhoUniforme;
		this.posicao = posicao;
		this.numeroCamisa = numeroCamisa;
		this.golsTotais = golsTotais;
	}

	public String getTamanhoUniforme() {
		return tamanhoUniforme;
	}

	public void setTamanhoUniforme(String tamanhoUniforme) {
		this.tamanhoUniforme = tamanhoUniforme;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public int getNumeroCamisa() {
		return numeroCamisa;
	}

	public void setNumeroCamisa(int numeroCamisa) {
		this.numeroCamisa = numeroCamisa;
	}

	public int getGolsTotais() {
		return golsTotais;
	}

	public void setGolsTotais(int golsTotais) {
		this.golsTotais = golsTotais;
	}
	public void treinar() {
		System.out.println("\n Jogador " + this.getNome() + " está treinando.");
	}
	public void marcarGol() {
		System.out.println("\n Jogador " + this.getNome() + " marcou um gol.");
		this.golsTotais ++;
	}

	@Override
	public String toString() {
		return super.toString() +"\n Tamanho Uniforme: " + tamanhoUniforme + "\n Posição: " + posicao + "\n Número Camisa:" + numeroCamisa
				+ "\n Gols Totais:" + golsTotais + "\n";
	}
}
