/*
Classe Jogadpr
 */
package br.com.una.quizzo;

import java.util.Scanner;

/**
 *
 * @author debora.goncalves
 */
public class Jogador extends Personagens {
	static Scanner input = new Scanner(System.in);

	private String nome;
	private String apelido;
	private String email;
	private String telefone;
	private String n;

	public Jogador(String n) {        
		this.n = n;
	}

	public String getNome() {
		return nome;
	}

	public String getApelido() {
		return apelido;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

	// public void setIdJogador() {
	//     this.idJogador = idJogador;
	// }

	public void setNome() {        
		System.out.printf("Informe o seu nome %s:\n>> ",this.n);		
		this.nome = input.nextLine();
	}

	public void setApelido() {
		System.out.printf("Informe seu apelido %s:\n>> ",this.n);
		this.apelido = input.nextLine();
	}

	public void setEmail() {
		System.out.printf("Informe seu email %s:\n>> ",this.n);
		this.email = input.nextLine();
	}

	public void setTelefone() {
		System.out.printf("Informe seu telefone %s:\n>> ",this.n);
		this.telefone = input.nextLine();
	}

	public void Cadastro(){
		this.setNome();
		this.setApelido();
		this.setEmail();        
		this.setTelefone();
	}

	public void show(){
		System.out.println("<<show:>>\n"+"\nNome = "+
				this.getNome()+"\nApelido = "+ 
				this.getApelido()+"\nEmail = "+
				this.getEmail()+"\nTelefone = "+
				this.getTelefone());
	}

}
