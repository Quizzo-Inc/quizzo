package br.com.una.quizzo_gui;

public class Jogador {
	String nomeJogador;
	Personagem personagemEscolhido;

	public Jogador() {

	}

	public String getNomeJogador() {
		return nomeJogador;
	}

	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}

	public Personagem getPersonagemEscolhido() {
		return personagemEscolhido;
	}

	public void setPersonagemEscolhido(Personagem personagemEscolhido) {
		this.personagemEscolhido = personagemEscolhido;
	}

}
