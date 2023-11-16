package futebol;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//JOGADORES (Nome, endereço, Nascimento, CPF, telefone, Tamanho do uniforme, posição de jogo, número da camisa e quantidade de gols)
		Jogador j1 = new Jogador("Cassio Arantes", "Rua Gonçalo de Carvalho – Porto Alegre (RS)", "12/02/1987", "543.759.234-87", 47659634, "M", "Goleiro", 1, 3);
		Jogador j2 = new Jogador("James Silva", "Alamenda do Mucugê – Arraial d'Ajuda (BA)", "23/12/1985", "143.759.234-00", 87659634, "G", "Lateral direito", 2, 243);
		Jogador j3 = new Jogador("Aécio Monteiro", "Vila do Giz – São Luís (MA)", "03/09/1990", "243.759.234-91", 97659634, "GG", "Lateral esquerdo", 3, 167);
		Jogador j4 = new Jogador("José Souza", "Rua das Pedras – Búzios (RJ)", "17/05/1993", "343.759.234-43", 87352765, "M", "Zagueiro Central", 4, 242);
		Jogador j5 = new Jogador("Lucas Mendes", "Rua da Aurora – Recife (PE)", "01/08/1983", "443.759.234-00", 95342754, "P", "Defesa", 5, 3);
		Jogador j6 = new Jogador("Matheus Lopes", "Avenida XV de Novembro – Blumenau (SC)", "13/02/1982", "543.759.234-43", 86346574, "M", "Meio-campista", 6, 123);
		Jogador j7 = new Jogador("Marcos Nunes", "Rua das Flores – Curitiba (PR)", "12/02/1991", "343.759.234-00", 80543767, "G", "Defensivo", 7, 3);
		Jogador j8 = new Jogador("Pedro Nascimento", "Rua Oscar Freire – São Paulo (SP)", "12/02/1986", "643.759.234-04", 90763765, "M", "Meio-campista", 8, 231);
		Jogador j9 = new Jogador("Felipe Pereira", "Avenidade Pituba – Itacaré (BA)", "12/02/1997", "753.759.234-30", 88764323, "GG", "Atacante", 9, 654);
		Jogador j10 = new Jogador("Thiago Moura", "Rua Bento Gonçalves – Erechim (RS)", "12/02/1992", "843.759.234-10", 47655787, "P", "Segunda atacante", 10, 243);
		Jogador j11 = new Jogador("Victor Lima", "Avenida Conde de Bobadela – Ouro Preto (MG)", "12/02/1987", "943.759.234-68", 89291238, "M", "Centroavante", 11, 216);
		
		Jogador j12 = new Jogador("Gabriel Oliveira", "Avenida Paulista – São Paulo (SP)", "05/04/1988", "154.759.234-22", 71234567, "M", "Goleiro", 12, 321);
		Jogador j13 = new Jogador("Lucas Santos", "Rua da Lapa – Rio de Janeiro (RJ)", "15/10/1995", "254.759.234-15", 80234567, "G", "Lateral direito", 13, 143);
		Jogador j14 = new Jogador("Rafael Costa", "Rua da Consolação – Curitiba (PR)", "25/07/1993", "354.759.234-79", 90234567, "GG", "Lateral esquerdo", 14, 176);
		Jogador j15 = new Jogador("Anderson Silva", "Avenida JK – Belo Horizonte (MG)", "07/09/1986", "454.759.234-33", 80234567, "M", "Zagueiro Central", 15, 198);
		Jogador j16 = new Jogador("Fernando Oliveira", "Rua Augusta – Lisboa", "02/11/1984", "554.759.234-88", 70234567, "P", "Defesa", 16, 267);
		Jogador j17 = new Jogador("Gustavo Pereira", "Avenida Beira Mar – Fortaleza (CE)", "10/03/1991", "654.759.234-21", 60234567, "M", "Meio-campista", 17, 145);
		Jogador j18 = new Jogador("Henrique Santos", "Rua das Laranjeiras – Salvador (BA)", "19/06/1982", "754.759.234-11", 90234567, "G", "Defensivo", 18, 329);
		Jogador j19 = new Jogador("João Oliveira", "Rua Oscar Niemeyer – Brasília (DF)", "28/01/1987", "854.759.234-45", 80234567, "M", "Meio-campista", 19, 231);
		Jogador j20 = new Jogador("Renato Pereira", "Avenida Atlântica – Balneário Camboriú (SC)", "14/12/1996", "954.759.234-99", 70234567, "GG", "Atacante", 20, 573);
		Jogador j21 = new Jogador("Rodrigo Lima", "Rua da Praia – Florianópolis (SC)", "03/06/1992", "154.759.234-71", 80234567, "P", "Segundo atacante", 21, 234);
		Jogador j22 = new Jogador("Alexandre Silva", "Avenida Copacabana – Rio de Janeiro (RJ)", "22/09/1985", "254.759.234-37", 90234567, "M", "Centroavante", 22, 296);
		
		Jogador j23 = new Jogador("Lucas Barros", "Rua Brigadeiro Lima– Porto Alegre (RS)", "03/11/1997", "543.759.234-87", 47659634, "G", "Goleiro", 23, 5);
		Jogador j24 = new Jogador("Nubio Rocha", "Rua Gonçalves Dias – Porto Alegre (RS)", "12/10/1990", "543.759.234-87", 47659634, "M", "Goleiro", 24, 10);
		Jogador j25 = new Jogador("Thiago Santos", "Avenida Atlântica – Balneário Camboriú (SC)", "28/03/1994", "654.759.234-62", 80234567, "G", "Lateral direito", 35, 165);
		
		Jogador j26 = new Jogador("Matheus Pereira", "Rua da Consolação – Curitiba (PR)", "09/11/1989", "754.759.234-24", 90234567, "GG", "Lateral esquerdo", 36, 187);
		Jogador j27 = new Jogador("Gabriel Silva", "Rua da Lapa – Rio de Janeiro (RJ)", "03/05/1986", "854.759.234-79", 80234567, "M", "Zagueiro Central", 37, 198);
		Jogador j28 = new Jogador("Vinícius Oliveira", "Avenida JK – Belo Horizonte (MG)", "21/08/1990", "954.759.234-33", 90234567, "P", "Defesa", 38, 251);


		//TREINADOR (Nome, endereço, Nascimento, CPF, telefone e Categoria de licença)
		Treinador t1 = new Treinador("Carlos Santos", "Rua das Palmeiras – Manaus (AM)", "08/11/1994", "354.759.234-54", 80234567, "A");
		Treinador t2 = new Treinador("Felipe Oliveira", "Alameda Santos – São Paulo (SP)", "17/07/1989", "454.759.234-64", 90234567, "PRO");

		//ESCALAÇÃO (Titular e Reserva)
		Escalacao escalacao = new Escalacao(null, null);
		escalacao.addTitular(j1);
		escalacao.addTitular(j2);
		escalacao.addTitular(j3);
		escalacao.addTitular(j4);
		escalacao.addTitular(j5);
		escalacao.addTitular(j6);
		escalacao.addTitular(j7);
		escalacao.addTitular(j8);
		escalacao.addTitular(j9);
		escalacao.addTitular(j10);
		escalacao.addTitular(j11);
		
		//ADICIONA ELES NA RESERVA
		escalacao.removerTitular(j23);
		escalacao.removerTitular(j24);
		escalacao.removerTitular(j25);
		
		Escalacao escalacao2 = new Escalacao(null, null);
		escalacao2.addTitular(j12);
		escalacao2.addTitular(j13);
		escalacao2.addTitular(j14);
		escalacao2.addTitular(j15);
		escalacao2.addTitular(j16);
		escalacao2.addTitular(j17);
		escalacao2.addTitular(j18);
		escalacao2.addTitular(j19);
		escalacao2.addTitular(j20);
		escalacao2.addTitular(j21);
		escalacao2.addTitular(j22);
		
		//ADICIONA ELES NA RESERVA
		escalacao2.removerTitular(j26);
		escalacao2.removerTitular(j27);
		escalacao2.removerTitular(j28);
		
		//TIME (nome, serie, escalacao)
		Time time = new Time("Corinthians", "A", escalacao, t1);
		Time time2 = new Time("Palmeiras", "A", escalacao2, t2);
		
		//PARTIDA (Data, local, Campeonato, time da casa, time de fora)
		Partida partida = new Partida("Arena Corinthians", "Brasileirão","17/12/2023", time, time2);
		
//		System.out.println(partida);
//		System.out.println(time);
		
//		System.out.println(j2);
//		j2.treinar();
//		j2.marcarGol();
//		j2.marcarGol();
//		j2.marcarGol();
//		System.out.println(j2);
		
		System.out.println(t1);
		t1.planejarJogo();
		t1.OrganizarEscalacao();

	}
}
