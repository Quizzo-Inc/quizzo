/*
    Classe Pergunta
 */
package br.com.una.quizzo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author debora.goncalves
 */
public class Pergunta {
	static Scanner input = new Scanner(System.in);
	private Integer resposta1;
	private Integer resposta2;
	private Integer contador = 0;

	public ArrayList<String> nome;

	public Pergunta() {

	}

	public void setName(String nome1, String nome2) {
		nome.add(nome1);
		nome.add(nome2);
	}

	public Integer getResposta1() {
		return resposta1;
	}

	public Integer getContador() {
		return contador;
	}

	public void setResposta1(Integer resposta1) {
		this.resposta1 = resposta1;
	}

	public Integer getResposta2() {
		return resposta2;
	}

	public void setResposta2(Integer resposta2) {
		this.resposta2 = resposta2;
	}

	public void Perguntas(String nome1, String nome2) throws Exception {
		String confirma = "\n>>[Digite uma opção ou digite 'SAIR' para desistir]<<\n ";
		String[] questoesPartida = {
				"Que codigo faz parte do bloco try? ",
				"Dado: int x[]; qual o valor de x?",
				"Qual palavra-chave usada para alocar memoria para um objeto recem-criado?",
				"Se voce precisasse fazer com que uma variavel especifica pertencesse a uma classe,"
						+ "e nao a uma instancia individual, que tipo de variavel usaria?",
						"Qual das opções abaixo não é linguagem de programação? ",
						"Faz parte da Programação Orientada a Objetos: ",
						"Na paradigma de Programação Orientação a Objetos em Java, para que um atributo de uma classe Funcionário possa ser acessado apenas por qualquer método de Funcionário ou por qualquer método definido em subclasses de Funcionário, sua visibilidade deve ser:",
						"Em Programação Orientada a Objetos, imagine uma classe chamada Pessoa que possua atributos e métodos comuns a outras classes, como por exemplo, Aluno, Professor, Funcionário e outros. Então é possível tornar a classe Pessoa em uma superclasse. Neste contexto, a ligação entre Aluno e Pessoa, dentro da implementação, chama-se:",
						"Quando estamos falando sobre sistemas que manipulam dados em um SGBD, existem quatro operações básicas que os desenvolvedores precisam implementar, conhecidas pelo acrônimo CRUD (Create, Read, Update, Delete). Sendo que cada uma dessas operações podem ser associadas a um comando SQL. Selecione entre as alternativas, a que apresenta essa relação corretamente, na mesma sequência das operações CRUD.",
						"Oque significa POO?"
		};

		String[][] opcoesPartida = { { "Qualquer codigo que tende a causar uma exceçao",
			"Qualquer codigo capaz de tratar uma exceçao",
			"Qualquer codigo que tende a imprimir os detalhes da exceçao",
		"Qualquer codigo que esteja protegido contra uma exceçao" },

				{ "1", "0", "nulo", "Algum numero aleatorio." },
				{ "store", "memory", "new", "adress" },
				{ "Uma variavel privada", "Uma variavel local", "Uma variavel publica", "Uma vari�vel estatica" } ,
				{"Java","String","C#","JavaScript"},
				{"Classe, int e Objetos", "Classe, Metodos e Atributos", "Classe, String e Atributos", "Variável, Metodos e Atributos"},
				{"privada (private)","pacote (package)","protegida (protected)","estática (static)"},
				{"Encapsulamento","Agregação","Herança","Associação"},
				{"INSERT, SELECT, UPDATE, DESTROY","APPEND, SELECT, UPDATE, DELETE","APPEND, SELECT, CHANGE, DELETE","INSERT, SELECT, UPDATE, DELETE"},
				{"Programação Orientada a Ojetos","Programação Facilitada","Programação complexa","Programação em camadas"}
		};

		String[] letras = { "{A} ", "{B} ", "{C} ", "{D} " };
		char[] respostaCerta = { 'A', 'C', 'C', 'D', 'B','B','C','C','D','A'};
		ArrayList<String> nome = new ArrayList<>();
		char resposta = ' ';
		nome.add(nome1);
		nome.add(nome2);
		int respostaPar = 0;
		int respostaImpar = 0;
		String vencedor = null;
		char escolhas = 'S';
		
		for (int i = 0, j = 0; i < questoesPartida.length; i++) {
			if (j > 1) {
				j = 0;
			}

			System.out.println("-------------------------------------------------");
			System.out.printf("vez de %s\n", nome.get(j));
			System.out.println(confirma);
			System.out.print((i+1)+" "+questoesPartida[i] + "\n");
			
			for (int k = 0; k < opcoesPartida[i].length; k++) {
				System.out.print(letras[k]);
				System.out.print(opcoesPartida[i][k] + "\n");
			}
			System.out.print("\n>>");
			resposta = input.next().toUpperCase().charAt(0);
			System.out.println("-------------------------------------------------");
			j++;

			if (resposta != "sair".toUpperCase().charAt(0)) {
				System.out.print("Tem certeza da sua resposta? Digite 'SIM para confirmar ou 'NAO' para mudar:\n>>");
				escolhas = input.next().toUpperCase().charAt(0);
				
				if (escolhas == "sim".toUpperCase().charAt(0)) {
					if (resposta == respostaCerta[i]) {
						
						Som.tocarSomAcerto();
						
						System.out.println("-------------------------------------------------");
						System.out.println("Voce acertou :)");
						System.out.println("-------------------------------------------------");
						if (j % 2 == 0) {
							respostaPar++;
						} else {
							respostaImpar++;
						}
					} else {
						
						Som.tocarSomErro();
						
						System.out.println("-------------------------------------------------");
						System.out
						.println("Que pena voce errou, a resposta correta era a letra >> " + respostaCerta[i]);
						System.out.println("-------------------------------------------------");
					}
				} else {
					System.out.println("okay");
					Perguntas(nome1, nome2);
				}

				if (respostaImpar > respostaPar)
					vencedor = nome.get(0);
				else if (respostaImpar < respostaPar) {
					vencedor = nome.get(1);

				} else {
					vencedor = "empate";
				}
			} else if (resposta == "sair".toUpperCase().charAt(0)) {
				System.out.println("Tem certeza que deseja desistir?\n>>");
				char escolha = input.next().toUpperCase().charAt(0);
				if (escolha == "sim".toUpperCase().charAt(0)) {
					System.out.println("okay");
					break;
				} else {
					Perguntas(nome1, nome2);
				}

			}

		}
		resultado(nome, respostaImpar, respostaPar, vencedor);
	}

	public void resultado(ArrayList<String> nome, int respostaImpar, int respostaPar, String vencedor) {
		System.out.println("-------------------------------------------------");
		System.out.println("<<Pontuação final>>");
		System.out.println(nome.get(0) + " = " + respostaImpar);
		System.out.println(nome.get(1) + " = " + respostaPar);
		if (vencedor == null)
			System.out.println("Não teve vencedor");
		else if (vencedor == "empate") {
			System.out.println("Empatou");
		} else {

			System.out.println("O vencedor foi = " + vencedor);
		}
		System.out.println("-------------------------------------------------");
	}

}
