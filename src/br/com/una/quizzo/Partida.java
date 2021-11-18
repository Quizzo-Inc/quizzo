package br.com.una.quizzo;

public class Partida {
	
	private int codigoPartida;
	private String personagensEscolhidos;
	private double porcentagemVida;
	private String enunciado;
	// private ListaAlternativas listaAlternativas;
	private boolean pararJogo;
	private boolean fimDeJogo;
	private boolean abandonarPartida;
	
	public Partida(int codigoPartida, String personagensEscolhidos, double porcentagemVida, String enunciado,
			boolean pararJogo, boolean fimDeJogo, boolean abandonarPartida) {
		super();
		this.codigoPartida = codigoPartida;
		this.personagensEscolhidos = personagensEscolhidos;
		this.porcentagemVida = porcentagemVida;
		this.enunciado = enunciado;
		this.pararJogo = pararJogo;
		this.fimDeJogo = fimDeJogo;
		this.abandonarPartida = abandonarPartida;
	}

	public int getCodigoPartida() {
		return codigoPartida;
	}

	public void setCodigoPartida(int codigoPartida) {
		this.codigoPartida = codigoPartida;
	}

	public String getPersonagensEscolhidos() {
		return personagensEscolhidos;
	}

	public void setPersonagensEscolhidos(String personagensEscolhidos) {
		this.personagensEscolhidos = personagensEscolhidos;
	}

	public double getPorcentagemVida() {
		return porcentagemVida;
	}

	public void setPorcentagemVida(double porcentagemVida) {
		this.porcentagemVida = porcentagemVida;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public boolean isPararJogo() {
		return pararJogo;
	}

	public void setPararJogo(boolean pararJogo) {
		this.pararJogo = pararJogo;
	}

	public boolean isFimDeJogo() {
		return fimDeJogo;
	}

	public void setFimDeJogo(boolean fimDeJogo) {
		this.fimDeJogo = fimDeJogo;
	}

	public boolean isAbandonarPartida() {
		return abandonarPartida;
	}

	public void setAbandonarPartida(boolean abandonarPartida) {
		this.abandonarPartida = abandonarPartida;
	}
	
	public String getEscolhaPersonagem(String escolhaPersonagem) { // TODO Implementar método
		return escolhaPersonagem;
	}
	
	public int getIdJogador(int idJogador) { // TODO Implementar método
		return idJogador;
	}
	
	public String getPersonagem(String personagem) { // TODO Implementar método
		return personagem;
	}
	
	public boolean temMenuPersonagem( ) { // TODO Implementar método
		return true; // TODO Ajustar retorno
	}
	
}
