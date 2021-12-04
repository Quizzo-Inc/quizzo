package QuiZzoInc;



public class Personagem {
	String nomePersonagem;
	double vidaPersonagem;
	boolean statusPersonagem;
	

	public Personagem(String nomePersonagem, double vidaPersonagem, boolean stautsPersonagem) {		
		this.nomePersonagem = nomePersonagem;
		this.vidaPersonagem = vidaPersonagem;
	}
	
	public String getNomePersonagem() {
		return nomePersonagem;
	}
	
	public void setNomePersonagem(String nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
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
	
	public void setStatusPersonagem(boolean statusPersonagem) {
		this.statusPersonagem = statusPersonagem;
	}
	
}

