package br.com.una.quizzo;

public class Jogador {
	
	private int idJogador;
	private String nome;
	private String apelido;
	private String email;
	private String telefone;
	
	public Jogador(int idJogador, String nome, String apelido, String email, String telefone) {
		super();
		this.idJogador = idJogador;
		this.nome = nome;
		this.apelido = apelido;
		this.email = email;
		this.telefone = telefone;
	}

	public int getIdJogador() {
		return idJogador;
	}

	public void setIdJogador(int idJogador) {
		this.idJogador = idJogador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public boolean iniciarPartida() {  // TODO Implementar método
		return true;
	}
	
	public boolean escolherPersonagem() {  // TODO Implementar método
		return true;
	}
	
	public boolean acessarMenuInicial() {  // TODO Implementar método
		return true;
	}
	
	public boolean responderPergunta() {  // TODO Implementar método
		return true;
	}
	
	public boolean selecionarAlternativa() {  // TODO Implementar método
		return true;
	}
	
	public boolean fazCadastroJogador() {  // TODO Implementar método
		return true;
	}
	
	public String getPersonagemId() {  // TODO Implementar método
		return "";
	}
	
	public String setPartidaId(String idPartida) {  // TODO Implementar método
		return idPartida;
	}
	
	public String getPerguntaId() {  // TODO Implementar método
		return "";
	}
	
	public String getAlternativaId( ) {  // TODO Implementar método
		return "";
	}
}
