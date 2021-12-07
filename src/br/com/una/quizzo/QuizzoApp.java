/*
Classe Executável
 */
package br.com.una.quizzo;

import java.util.Scanner;

/*
 *
 * @author Debora Gonçalves
 */
public class QuizzoApp {

	static Scanner input = new Scanner(System.in);

	public static void main(String[]args) throws Exception{
		System.out.println("BEM-VINDO AO QUIZZO! ^^ ");
		menu();
	}

	public static void menu() throws Exception {
		System.out.print("Escolha uma opção "
				+ "\n1:Começar partida "
				+ "\n2:Dev"
				+ "\n3:Informações do jogo"
				+ "\n4:Sair"
				+ "\n>> ");
		int escolha = input.nextInt();
		input.nextLine();
		switch(escolha){
		case 1:
			start();
			break;
		case 2:
			dev();
			break;
		case 3:
			informacoes();
			break;
		default:
			System.out.println("Até a próxima! ");
		}
	}

	public static void start() throws Exception {
		
		Som.tocarSomInicio();
		
		Jogador j1 = new Jogador("Jogador 1");
		Jogador j2 = new Jogador("Jogador 2");
		Pergunta p1 = new Pergunta();
		j1.Cadastro();
		j1.escolhaPersonagem(9);
		j1.showPersonagem();
		j2.Cadastro();        
		j2.escolhaPersonagem(j1.getEscolha());
		j2.showPersonagem();
		p1.Perguntas(j1.getNome(),j2.getNome());
		menu();
	}

	public static void dev() throws Exception {
		System.out.println("-------------------------------------------------");
		System.out.println("Augusto César Emanuel Rosa de Assis " + "RA: 321110261");
		System.out.println("Debora Ferreira Gonçalves " + "RA: 321119461");
		System.out.println("Gabriel Lucas de Paula Gomes " + "RA: 321221122");
		System.out.println("Marcelo Laurentino Costa Melo " + "RA: 321220650");
		System.out.println("Tulho Henrique de Oliveira Melo " + "RA: 321213318");
		System.out.println("-------------------------------------------------");
		menu();    
	}

	public static void informacoes() throws Exception {
		System.out.println("-------------------------------------------------");
		System.out.println("O Quizzo é um jogo de perguntas e respostas para dois jogadores.\n"+
				"Ganha o jogador que acertar o maior número de perguntas.\n"+
				"Caso a opção escolhida esteja incorreta, o jogo mostrará a resposta correta na tela.");
		System.out.println("-------------------------------------------------");
		menu(); 
	}
}
