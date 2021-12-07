package br.com.una.quizzo;

import java.util.Scanner;

public class Personagens extends Pergunta {
	private String nomePersonagem;
	private Double vidaPersonagem;
	private Boolean  statusPersonagem;
	private String habilidades;
	private Integer tempoVida;
	private Integer escolha;
	Scanner input = new Scanner(System.in);

	public Personagens()  {		

	}

	public String getNomePersonagem() {
		return nomePersonagem;
	}

	public void setNomePersonagem(String nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}

	public void setStatusPersonagem(){
		this.statusPersonagem = true;
	}

	public double getVidaPersonagem() {
		return vidaPersonagem;
	}

	public void setVidaPersonagem(double vidaPersonagem) {
		this.vidaPersonagem = vidaPersonagem;
	}

	public boolean getStatusPersonagem() {
		return statusPersonagem;
	}
	
	public Integer getEscolha() {
		return escolha;
	}

	public void setStatusPersonagem(boolean statusPersonagem) {
		this.statusPersonagem = statusPersonagem;
	}

	public void escolhaPersonagem(int escolha) {
		String[][] Personagem = {{ "Fio Germi", "Katalina", "Marco Rossi", "Mello", "Tarma Roving",},// NOME
				{"kamehame-ha","Final Flash","Masenko","Burning Attack","Makankosappo"},//HABILIDADE
				{"3000","3500","2000","1800","1500"}};// TEMPO DE VIDA
		System.out.println("-------------------------------------------------");
		System.out.println("Escolha seu personagem:");
		for (int i = 0; i < 5; i++)
			if(i!=escolha)
				System.out.println("[" + (i + 1) + "] " + Personagem[0][i]);
		System.out.print(">> ");
		this.escolha = input.nextInt() - 1;
		System.out.println("-------------------------------------------------");
		this.nomePersonagem = Personagem[0][this.escolha];     
		this.habilidades = Personagem[1][this.escolha];
		this.tempoVida = Integer.parseInt(Personagem[2][this.escolha]);
		this.setStatusPersonagem();
	}
	
	public void showPersonagem(){
		System.out.println("-------------------------------------------------");
		System.out.println("Personagem escolhido >> " + this.getNomePersonagem() + " Ponto de Vida >> " +this.tempoVida);
		System.out.println("-------------------------------------------------");
	}
	
}


