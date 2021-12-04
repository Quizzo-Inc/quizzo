/* CODIGO PROPRIEDADE DE QUIZZOINC 
 * 
 * PROIBIDO A COPIA OU VENDA
 * 
 * CODDERS:
 * Marcelo Laurentino Costa Melo        RA: 321220650
 * Gabriel Lucas de Paula Gomes         RA: 321221122
 * Tulho Henrique de Oliveira Melo      RA: 321213318
 * 
 */



package QuiZzoInc;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Quizzo implements ActionListener {
	JFrame frame = new JFrame();
	JTextField textfield = new JTextField();	

	/*----------------------------DEVS----------------------------*/
	JTextArea devNome0 = new JTextArea();
	JTextArea devNome1 = new JTextArea();
	JTextArea devNome2 = new JTextArea();
	JTextArea devNome3 = new JTextArea();
	JTextArea devNome4 = new JTextArea();
	
	JLabel areaAugustoFoto = new JLabel();
	JLabel areaDeboraFoto = new JLabel();
	JLabel areaGabrielFoto = new JLabel();
	JLabel areaMarceloFoto = new JLabel();
	JLabel areaTulhoFoto = new JLabel();
	
	/*------------------------MENU INICIAL------------------------*/
	String[] botSelection = { "INICIO", "DEVS", "REGRAS", "SAIR" };
	
	JButton bInicio = new JButton();
	JButton bDevs = new JButton();
	JButton bRegras = new JButton();
	JButton bSair = new JButton();

	/*-------------------CADASTRO JOGADOR-------------------------*/
	ArrayList<String> cadJog = new ArrayList<>();
	
	Jogador jogador1 = new Jogador();
	Jogador jogador2 = new Jogador();
	
	/*------------------------MENU PERSONAGENS--------------------*/
	ArrayList<String> pChoise = new ArrayList<>();
	
	JTextField persTitle = new JTextField();
	
	JTextArea persArea = new JTextArea();
	
	JLabel areaP1Foto = new JLabel();
	JLabel areaP2Foto = new JLabel();
	JLabel areaP3Foto = new JLabel();
	JLabel areaP4Foto = new JLabel();
	JLabel areaP5Foto = new JLabel();
	
	
	/*------------------------PERSONAGENS-------------------------*/
	Personagem fioGermi = new Personagem("Fio Germi", 100.0, false);
	Personagem katalina = new Personagem("Katalina", 100.0, false);
	Personagem mello = new Personagem("Mello", 100.0, false);
	Personagem marcoRossi = new Personagem("Marco Rossi", 100.0, false);
	Personagem tarmaRoving = new Personagem("Tarma Roving", 100.0, false);	
	
	
	JButton bP1 = new JButton();	
	JButton bP2 = new JButton();
	JButton bP3 = new JButton();
	JButton bP4 = new JButton();
	JButton bP5 = new JButton();
	
	JLabel fotoP1 = new JLabel();
	JLabel fotoP2 = new JLabel();
	JLabel fotoP3 = new JLabel();
	JLabel fotoP4 = new JLabel();
	JLabel fotoP5 = new JLabel();
	
	int countPersonagem = 0;
	
	
	/*---------------------------PARTIDA--------------------------*/
	JTextField campoQuestao = new JTextField(); // TEXT FIELD TO HOLD CURRIENT QUESTION
	JTextArea areaQuestao = new JTextArea(); // TEXT AREA TO HOLD CURRIENT QUESTION	
	
	JButton bRespostaA = new JButton(); // A BUTTON
	JButton bRespostaB = new JButton(); // B BUTTON
	JButton bRespostaC = new JButton(); // C BUTTON
	JButton bRespostaD = new JButton(); // D BUTTON
	
	JLabel respostaA = new JLabel(); // A ANSWER
	JLabel respostaB = new JLabel(); // B ANSWER
	JLabel respostaC = new JLabel(); // C ANSWER
	JLabel respostaD = new JLabel(); // D ANSWER
	
	/*----------------------------APPEAR AFTER CALCULATE RESULT--------------------------------*/
	JTextField numeroAcertos = new JTextField(); // DISPLAY NUMBER OF QUESTIOS GUESSED RIGHT
	JTextField porcentagemAcertos = new JTextField(); // DISPLAY PERCENTAGE OF SCORE
	
	
	JLabel textTempo = new JLabel(); // DISPLAY WORD "TIME"
	JLabel cronometroSegundos = new JLabel(); // DISPLAY COUNT DOWN TIME
	
	String[] questoesPartida = {
								"Que código faz parte do bloco try?",
								"Dado: int x[]; qual é o valor de x?",
								"Qual palavra-chave é usada para alocar memória para um objeto recém-criado?",
								"Se você precisasse fazer com que uma variável específica pertencesse a uma classe, "
								+ "e nao a uma instância individual, que tipo de variável usaria?"
								
								
				
								
	};
	
	String[][] opcoesPartida = {
								/*-----------------------QUESTAO 1-----------------------------------*/
								{	"Qualquer código que tende a causar uma exceção", 
									"Qualquer código capaz de tratar uma exceção", 
									"Qualquer código que tende a imprimir os detalhes da exceção", 
									"Qualquer código que esteja protegido contra uma exceção"		
								},
								/*-----------------------QUESTAO 2-----------------------------------*/
								{
									"1", "0", "nulo", "Algum número aleatorio."
								},
								/*-----------------------QUESTAO 3-----------------------------------*/
								{
									"store", "memory", "new", "adress"
								},
								/*-----------------------QUESTAO 4-----------------------------------*/
								{	"Uma variável privada", "Uma variável local", "Uma variável pública", "Uma variável estática"
									
								}
	};
	
	char[] respostasPartida = {
								'A',
								'C',
								'C',
								'D'
	};
	
	char chutes; // GUESS
	char respostas; // ANSWER?
	int index; // INDEX
	int chutesCertos = 0; // CORRECT NUMBER OF GUESSES
	int totalQuestoes = questoesPartida.length; // CHANGES SIZE OF QUESTIONS AUTOMATICALLY
	int resultado; // RESULT
	int segundos = 10; // CURRIENT AMOUNT OF TIME TO ANSWER QUESTION
	
	
	
	

	public String janela;

	/*-------------------------------------------------------------------------METODO CONSTRUTOR-----------------------------------------------------------------------*/
	public Quizzo() {

	}
	
	/*------------------------------------------------------------------------------JANELA-----------------------------------------------------------------------------*/
	public String Janela() {

		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // FEXA JALENA NO X
		this.frame.setSize(1015, 1000); // TAMANHO DA JANELA
		this.frame.getContentPane().setBackground(new Color(12, 97, 112)); // COR DA JANELA
		this.frame.setLayout(null); // NULL LAYOUT
		this.frame.setResizable(false); // JANELA NAO ALTERA TAMANHO

		frame.setVisible(true);

		return janela;
	}

	/*--------------------------------------------------------------------------MENU INICIAL---------------------------------------------------------------------------*/
	public void MenuInicial() {

		/*------------------------------------------BOTAO INICIO--------------------------------------------------*/
		bInicio.setBounds(375, 200, 250, 75);
		bInicio.setBackground(new Color(164, 229, 224)); // SETTA COR DO PLANO DE FUNDO DO NUMERO DA QUESTAO
		bInicio.setForeground(new Color(12, 97, 112)); // SETTA COR DO TEXTO DO NUMERO DA QUESTAO
		bInicio.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
		bInicio.setFocusable(false);
		bInicio.setText("INICIO");
		bInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent botAction) {
				bInicio.setVisible(false);
				bDevs.setVisible(false);
				cadastroJogador();

			}
		});

		/*------------------------------------------BOTAO DEVS--------------------------------------------------*/
		bDevs.setBounds(375, 310, 250, 75);
		bDevs.setBackground(new Color(164, 229, 224)); // SETTA COR DO PLANO DE FUNDO DO NUMERO DA QUESTAO
		bDevs.setForeground(new Color(12, 97, 112)); // SETTA COR DO TEXTO DO NUMERO DA QUESTAO
		bDevs.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
		bDevs.setFocusable(false);
		bDevs.setText("DEVS");
		bDevs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent botAction) {
				bInicio.setVisible(false);
				bDevs.setVisible(false);
				menuDevs();

			}
		});

		frame.add(bInicio);
		frame.add(bDevs);


	}

	/*-------------------------------------------------------------------------CADASTRO JOGADOR------------------------------------------------------------------------*/
	public void cadastroJogador() {
		
		String cadJogador1 = JOptionPane.showInputDialog(frame, "Jogador Nº1 Insira um nome para Cadastro:");
		String cadJogador2 = JOptionPane.showInputDialog(frame, "Jogador Nº2 Insira um nome para Cadastro:");
		
		jogador1.setNomeJogador(cadJogador1);
		jogador2.setNomeJogador(cadJogador2);		
		
		ArrayList<String> cadJog = new ArrayList<>();
		cadJog.add(cadJogador1);
		cadJog.add(cadJogador2);		
		
		if(cadJog.size() == 2) {
			MenuEscolhaPersonagem();
		}	

	}	

	/*----------------------------------------------------------------------------MENU DEVS----------------------------------------------------------------------------*/
	public void menuDevs() {
		ArrayList<String> meDevs = new ArrayList<>();

		meDevs.add("Augusto César Emanuel Rosa de Assis" + "321110261");
		meDevs.add("Debora Ferreira Gonçalves" + "321119461");
		meDevs.add("Gabriel Lucas de Paula Gomes" + "321221122");
		meDevs.add("Marcelo Laurentino Costa Melo" + "321220650");
		meDevs.add("Tulho Henrique de Oliveira Melo, " + "321213318");

		/*--------------------------------------------------FRONT END TEXTO DEVS--------------------------------------------------*/
		textfield.setBounds(0, 0, 1000, 100); // DEFINE A AREA DO TEXTO DO NUMERO DA QUESTÃO
		textfield.setBackground(new Color(164, 229, 224)); // SETTA COR DO PLANO DE FUNDO DO NUMERO DA QUESTAO
		textfield.setForeground(new Color(12, 97, 112)); // SETTA COR DO TEXTO DO NUMERO DA QUESTAO
		textfield.setFont(new Font("Comic book", Font.PLAIN, 80)); // SETTA TIPO DE FONTE E TAMANHO DO NUMERO DA QUESTAO
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER); // SETTA ALINHAMENTO DO TEXTO DO NUMERO DA QUESTAO
		textfield.setEditable(false); // SETTA COMO INALTERAVEL O TEXTO DO NUMERO DA QUESTAO
		textfield.setText("DEVS");

		/*--------------------------------------------------FRONT END TEXTO INFO DEVS----------------------------------------------*/
		devNome0.setBounds(100, 100, 900, 100); // I_VER, I_HOR, F_VER, F_HOR
		devNome0.setLineWrap(true);
		devNome0.setWrapStyleWord(true);
		devNome0.setBackground(new Color(219, 245, 240));
		devNome0.setForeground(new Color(12, 97, 112));
		devNome0.setFont(new Font("Comic book", Font.PLAIN, 25));
		devNome0.setBorder(BorderFactory.createBevelBorder(1));
		devNome0.setEditable(false);
		devNome0.setText("     Augusto César Emanuel Rosa de Assis " + "\n     RA: 321110261");

		devNome1.setBounds(100, 200, 900, 100); // I_VER, I_HOR, F_VER, F_HOR
		devNome1.setLineWrap(true);
		devNome1.setWrapStyleWord(true);
		devNome1.setBackground(new Color(219, 245, 240));
		devNome1.setForeground(new Color(12, 97, 112));
		devNome1.setFont(new Font("Comic book", Font.PLAIN, 25));
		devNome1.setBorder(BorderFactory.createBevelBorder(1));
		devNome1.setEditable(false);
		devNome1.setText("     Debora Ferreira Gonçalves" + "\n     RA: 321119461");

		devNome2.setBounds(100, 300, 900, 100); // I_VER, I_HOR, F_VER, F_HOR
		devNome2.setLineWrap(true);
		devNome2.setWrapStyleWord(true);
		devNome2.setBackground(new Color(219, 245, 240));
		devNome2.setForeground(new Color(12, 97, 112));
		devNome2.setFont(new Font("Comic book", Font.PLAIN, 25));
		devNome2.setBorder(BorderFactory.createBevelBorder(1));
		devNome2.setEditable(false);
		devNome2.setText("     Gabriel Lucas de Paula Gomes" + "\n     RA: 321221122");
		ImageIcon gabrielFoto = new ImageIcon("C:\\Users\\marce\\OneDrive\\Área de Trabalho\\QuiZzo\\Backup\\QuiZzo Code\\QuiZzo\\FotoDevs\\Gabriel.jpeg");
		areaGabrielFoto.setIcon(gabrielFoto);
		areaGabrielFoto.setBounds(0, 300, 100, 100);
		areaGabrielFoto.setBorder(BorderFactory.createLineBorder(new Color(219, 245, 240), 3, true));

		devNome3.setBounds(100, 400, 900, 100); // I_VER, I_HOR, F_VER, F_HOR
		devNome3.setLineWrap(true);
		devNome3.setWrapStyleWord(true);
		devNome3.setBackground(new Color(219, 245, 240));
		devNome3.setForeground(new Color(12, 97, 112));
		devNome3.setFont(new Font("Comic book", Font.PLAIN, 25));
		devNome3.setBorder(BorderFactory.createBevelBorder(1));
		devNome3.setEditable(false);
		devNome3.setText("     Marcelo Laurentino Costa Melo" + "\n     RA: 321220650");

		devNome4.setBounds(100, 500, 900, 100); // I_VER, I_HOR, F_VER, F_HOR
		devNome4.setLineWrap(true);
		devNome4.setWrapStyleWord(true);
		devNome4.setBackground(new Color(219, 245, 240));
		devNome4.setForeground(new Color(12, 97, 112));
		devNome4.setFont(new Font("Comic book", Font.PLAIN, 25));
		devNome4.setBorder(BorderFactory.createBevelBorder(1));
		devNome4.setEditable(false);
		devNome4.setText("     Tulho Henrique de Oliveira Melo " + "\n     RA: 321213318");

		
		

		frame.add(areaGabrielFoto);
		frame.add(textfield);
		frame.add(devNome0);
		frame.add(devNome1);
		frame.add(devNome2);
		frame.add(devNome3);
		frame.add(devNome4);

		
	}

	/*--------------------------------------------------------------------MENU ESCOLHA PERSONAGEM----------------------------------------------------------------------*/
	public int MenuEscolhaPersonagem() {
		
		
		
		/*--------------------FRAME DOS PERSONAGENS------------------*/ // NOME - VIDA		
		persTitle.setBounds(0, 0, 1000, 100); // DEFINE A AREA DO TEXTO DO NUMERO DA QUESTÃO
		persTitle.setBackground(new Color(164, 229, 224)); // SETTA COR DO PLANO DE FUNDO DO NUMERO DA QUESTAO
		persTitle.setForeground(new Color(12, 97, 112)); // SETTA COR DO TEXTO DO NUMERO DA QUESTAO
		persTitle.setFont(new Font("Comic book", Font.PLAIN, 80)); // SETTA TIPO DE FONTE E TAMANHO DO NUMERO DA QUESTAO
		persTitle.setBorder(BorderFactory.createBevelBorder(1));
		persTitle.setHorizontalAlignment(JTextField.CENTER); // SETTA ALINHAMENTO DO TEXTO DO NUMERO DA QUESTAO
		persTitle.setEditable(false); // SETTA COMO INALTERAVEL O TEXTO DO NUMERO DA QUESTAO
		persTitle.setText("PERSONAGENS");
		persTitle.setVisible(true);	
		
		/*---------------FIO GERMI---------------*/
		bP1.setBounds(25, 500, 150, 50);
		bP1.setBackground(new Color(164, 229, 224)); // SETTA COR DO PLANO DE FUNDO DO NUMERO DA QUESTAO
		bP1.setForeground(new Color(12, 97, 112)); // SETTA COR DO TEXTO DO NUMERO DA QUESTAO
		bP1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		bP1.setFocusable(false);
		bP1.setText("Fio Germi");
		ImageIcon fotoP1 = new ImageIcon("C:\\Users\\marce\\OneDrive\\Área de Trabalho\\QuiZzo\\Backup\\QuiZzo Code\\QuiZzo\\FotoPersonagens\\Fio_Germi.png");
		areaP1Foto.setIcon(fotoP1);
		areaP1Foto.setBounds(25, 200, 150, 300);
		areaP1Foto.setBorder(BorderFactory.createLineBorder(new Color(219, 245, 240), 3, true));
		bP1.setVisible(true);
		bP1.setBorder(BorderFactory.createLineBorder(new Color(219, 245, 240), 3, true));
		
		bP1.addActionListener(new ActionListener() {			

			public void actionPerformed(ActionEvent botAction) {				
				
				bP1.setEnabled(false);
				areaP1Foto.setBorder(BorderFactory.createLineBorder(new Color(255, 0, 0), 3, true));				
				countPersonagem++;
				fioGermi.setStatusPersonagem(true);
				if(countPersonagem == 0) {
				//bP1.setText("Jogador 1");
					jogador1.setPersonagemEscolhido(fioGermi);
					
				}
				else if(countPersonagem == 1) {
					//bP1.setText("Jogador 2");		
					jogador2.setPersonagemEscolhido(fioGermi);
					
				}
				else if(countPersonagem > 1) {
					comecarJogo();
				}
				
			} 
		});
		
		/*---------------KATALINA---------------*/
		bP2.setBounds(225, 600, 150, 50);
		bP2.setBackground(new Color(164, 229, 224)); // SETTA COR DO PLANO DE FUNDO DO NUMERO DA QUESTAO
		bP2.setForeground(new Color(12, 97, 112)); // SETTA COR DO TEXTO DO NUMERO DA QUESTAO
		bP2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		bP2.setFocusable(false);
		bP2.setText("Katalina");
		ImageIcon fotoP2 = new ImageIcon("C:\\Users\\marce\\OneDrive\\Área de Trabalho\\QuiZzo\\Backup\\QuiZzo Code\\QuiZzo\\FotoPersonagens\\Katalina.png");
		areaP2Foto.setIcon(fotoP2);
		areaP2Foto.setBounds(225, 300, 150, 300);
		areaP2Foto.setBorder(BorderFactory.createLineBorder(new Color(219, 245, 240), 3, true));
		bP2.setVisible(true);
		bP2.setBorder(BorderFactory.createLineBorder(new Color(219, 245, 240), 3, true));
		bP2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent botAction) {
				bP2.setEnabled(false);
				areaP2Foto.setBorder(BorderFactory.createLineBorder(new Color(255, 0, 0), 3, true));
				countPersonagem++;
				katalina.setStatusPersonagem(true);
				if(countPersonagem == 0) {				
					jogador1.setPersonagemEscolhido(katalina);				
				}
				else if(countPersonagem == 1) {
					jogador2.setPersonagemEscolhido(katalina);
				}
				else if(countPersonagem > 1) {
					comecarJogo();	
				}
			}
		});
		
		/*---------------MARCO ROSSI---------------*/
		bP3.setBounds(425, 500, 150, 50);
		bP3.setBackground(new Color(164, 229, 224)); // SETTA COR DO PLANO DE FUNDO DO NUMERO DA QUESTAO
		bP3.setForeground(new Color(12, 97, 112)); // SETTA COR DO TEXTO DO NUMERO DA QUESTAO
		bP3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		bP3.setFocusable(false);
		bP3.setText("Marco Rossi");
		ImageIcon fotoP3 = new ImageIcon("C:\\Users\\marce\\OneDrive\\Área de Trabalho\\QuiZzo\\Backup\\QuiZzo Code\\QuiZzo\\FotoPersonagens\\Marco_Rossi.png");
		areaP3Foto.setIcon(fotoP3);
		areaP3Foto.setBounds(425, 200, 150, 300);
		areaP3Foto.setBorder(BorderFactory.createLineBorder(new Color(219, 245, 240), 3, true));
		bP3.setVisible(true);
		bP3.setBorder(BorderFactory.createLineBorder(new Color(219, 245, 240), 3, true));
		bP3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent botAction) {
				countPersonagem++;
				marcoRossi.setStatusPersonagem(true);
				bP3.setEnabled(false);
				areaP3Foto.setBorder(BorderFactory.createLineBorder(new Color(255, 0, 0), 3, true));
				if(countPersonagem == 0) {
					jogador1.setPersonagemEscolhido(marcoRossi);
				}
				else if(countPersonagem == 1) {
					jogador2.setPersonagemEscolhido(marcoRossi);
				}
				else if(countPersonagem > 1) {
					comecarJogo();	
				}
				
			}
		});
		
		/*---------------MELLO---------------*/
		bP4.setBounds(625, 600, 150, 50);
		bP4.setBackground(new Color(164, 229, 224)); // SETTA COR DO PLANO DE FUNDO DO NUMERO DA QUESTAO
		bP4.setForeground(new Color(12, 97, 112)); // SETTA COR DO TEXTO DO NUMERO DA QUESTAO
		bP4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		bP4.setFocusable(false);
		bP4.setText("Mello");
		ImageIcon fotoP4 = new ImageIcon("C:\\Users\\marce\\OneDrive\\Área de Trabalho\\QuiZzo\\Backup\\QuiZzo Code\\QuiZzo\\FotoPersonagens\\Mello.png");
		areaP4Foto.setIcon(fotoP4);
		areaP4Foto.setBounds(625, 300, 150, 300);
		areaP4Foto.setBorder(BorderFactory.createLineBorder(new Color(219, 245, 240), 3, true));
		bP4.setVisible(true);
		bP4.setBorder(BorderFactory.createLineBorder(new Color(219, 245, 240), 3, true));
		bP4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent botAction) {
				countPersonagem++;
				mello.setStatusPersonagem(true);
				bP4.setEnabled(false);
				areaP4Foto.setBorder(BorderFactory.createLineBorder(new Color(255, 0, 0), 3, true));
				if(countPersonagem == 0) {
					jogador1.setPersonagemEscolhido(mello);				
				}
				else if(countPersonagem == 1) {
					jogador2.setPersonagemEscolhido(mello);
				}
				else if(countPersonagem > 1) {
					comecarJogo();
				}
			}
		});
		
		/*---------------TARMA ROVING---------------*/
		bP5.setBounds(825, 500, 150, 50);
		bP5.setBackground(new Color(164, 229, 224)); // SETTA COR DO PLANO DE FUNDO DO NUMERO DA QUESTAO
		bP5.setForeground(new Color(12, 97, 112)); // SETTA COR DO TEXTO DO NUMERO DA QUESTAO
		bP5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		bP5.setFocusable(false);
		bP5.setText("Tarma Roving");
		ImageIcon fotoP5 = new ImageIcon("C:\\Users\\marce\\OneDrive\\Área de Trabalho\\QuiZzo\\Backup\\QuiZzo Code\\QuiZzo\\FotoPersonagens\\Tarma_Roving.png");
		areaP5Foto.setIcon(fotoP5);
		areaP5Foto.setBounds(825, 200, 150, 300);
		areaP5Foto.setBorder(BorderFactory.createLineBorder(new Color(219, 245, 240), 3, true));
		bP5.setVisible(true);
		bP5.setBorder(BorderFactory.createLineBorder(new Color(219, 245, 240), 3, true));
		bP5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent botAction) {
				countPersonagem++;
				tarmaRoving.setStatusPersonagem(true);
				bP5.setEnabled(false);
				areaP5Foto.setBorder(BorderFactory.createLineBorder(new Color(255, 0, 0), 3, true));
				if(countPersonagem == 0) {
					jogador1.setPersonagemEscolhido(tarmaRoving);
				}
				else if(countPersonagem == 1) {
					jogador2.setPersonagemEscolhido(tarmaRoving);
				}
				else if(countPersonagem > 1) {
					comecarJogo();
				}
				
			}
		});
		
		
		
		frame.add(bP1);
		frame.add(bP2);
		frame.add(bP3);
		frame.add(bP4);
		frame.add(bP5);
		
		frame.add(areaP1Foto);
		frame.add(areaP2Foto);
		frame.add(areaP3Foto);
		frame.add(areaP4Foto);
		frame.add(areaP5Foto);
		
		frame.add(persTitle);
		
		return countPersonagem;
		
	}
	
	/*---------------------------------------------------------------------------COMEÇAR JOGO--------------------------------------------------------------------------*/
	public void comecarJogo() {
		bP1.setVisible(false);
		bP2.setVisible(false);
		bP3.setVisible(false);
		bP4.setVisible(false);
		bP5.setVisible(false);
		
		areaP1Foto.setVisible(false);
		areaP2Foto.setVisible(false);
		areaP3Foto.setVisible(false);
		areaP4Foto.setVisible(false);
		areaP5Foto.setVisible(false);
		
		persTitle.setVisible(false);
		
		partida();
	}	
	
	/*---------------------------------------------TIMER---------------------------------------------*/
	Timer timer = new Timer(5000, new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {

			segundos--;
			cronometroSegundos.setText(String.valueOf(segundos));
			if (segundos <= 0) {
				mostrarRespostas();
			}
		}

	});
	/*-------------------------------------------FIM TIMER-------------------------------------------*/	
	
	/*-----------------------------------------PROXIMA QUESTAO---------------------------------------*/
	public void partida() {
		
	
		
		/*----------------------------DESIGN QUESTAO NUMERO----------------------------------*/
		textfield.setBounds(0, 0, 650, 50); // DEFINE A AREA DO TEXTO DO NUMERO DA QUESTÃO
		textfield.setBackground(new Color(25, 25, 25)); // SETTA COR DO PLANO DE FUNDO DO NUMERO DA QUESTAO
		textfield.setForeground(new Color(25, 255, 0)); // SETTA COR DO TEXTO DO NUMERO DA QUESTAO
		textfield.setFont(new Font("Ink Free", Font.BOLD, 30)); // SETTA TIPO DE FONTE E TAMANHO DO NUMERO DA QUESTAO
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER); // SETTA ALINHAMENTO DO TEXTO DO NUMERO DA QUESTAO
		textfield.setEditable(false); // SETTA COMO INALTERAVEL O TEXTO DO NUMERO DA QUESTAO

		areaQuestao.setBounds(0, 50, 650, 50);
		areaQuestao.setLineWrap(true);
		areaQuestao.setWrapStyleWord(true);
		areaQuestao.setBackground(new Color(25, 25, 25));
		areaQuestao.setForeground(new Color(25, 255, 0));
		areaQuestao.setFont(new Font("MV Boli", Font.BOLD, 25));
		areaQuestao.setBorder(BorderFactory.createBevelBorder(1));
		areaQuestao.setEditable(false);
		
		/*-------------------------------DESIGNING BOTOES -----------------------------------*/
		bRespostaA.setBounds(0, 100, 100, 100); // SETTING SIZE-BOUNDS
		bRespostaA.setFont(new Font("MV Boli", Font.BOLD, 25)); // SETTING FONT TYPE
		bRespostaA.setFocusable(false);
		bRespostaA.addActionListener(this);
		bRespostaA.setText("A"); // SETTING TEXT DISPLAY

		bRespostaB.setBounds(0, 200, 100, 100);
		bRespostaB.setFont(new Font("MV Boli", Font.BOLD, 25));
		bRespostaB.setFocusable(false);
		bRespostaB.addActionListener(this);
		bRespostaB.setText("B");

		bRespostaC.setBounds(0, 300, 100, 100);
		bRespostaC.setFont(new Font("MV Boli", Font.BOLD, 25));
		bRespostaC.setFocusable(false);
		bRespostaC.addActionListener(this);
		bRespostaC.setText("C");

		bRespostaD.setBounds(0, 400, 100, 100);
		bRespostaD.setFont(new Font("MV Boli", Font.BOLD, 25));
		bRespostaD.setFocusable(false);
		bRespostaD.addActionListener(this);
		bRespostaD.setText("D");
		
		/*-------------------------------DESIGNING RESPOSTAS---------------------------------*/
		respostaA.setBounds(125, 100, 500, 100); // SETING SIZE-BOUNDS
		respostaA.setBackground(new Color(50, 50, 50)); // SETTING BACKGROUND COLOR
		respostaA.setForeground(new Color(25, 255, 0)); // SETING FOREGROUND COLOR
		respostaA.setFont(new Font("MV Boli", Font.PLAIN, 35)); // SETTING FONT TYPE

		respostaB.setBounds(125, 200, 500, 100);
		respostaB.setBackground(new Color(50, 50, 50));
		respostaB.setForeground(new Color(25, 255, 0));
		respostaB.setFont(new Font("MV Boli", Font.PLAIN, 35));

		respostaC.setBounds(125, 300, 500, 100);
		respostaC.setBackground(new Color(50, 50, 50));
		respostaC.setForeground(new Color(25, 255, 0));
		respostaC.setFont(new Font("MV Boli", Font.PLAIN, 35));

		respostaD.setBounds(125, 400, 500, 100);
		respostaD.setBackground(new Color(50, 50, 50));
		respostaD.setForeground(new Color(25, 255, 0));
		respostaD.setFont(new Font("MV Boli", Font.PLAIN, 35));
		
		/*-------------------------------------CRONOMETRO-------------------------------------*/
		cronometroSegundos.setBounds(535, 510, 100, 100);
		cronometroSegundos.setBackground(new Color(25, 25, 25));
		cronometroSegundos.setForeground(new Color(255, 0, 0));
		cronometroSegundos.setFont(new Font("Inc Free", Font.BOLD, 60));
		cronometroSegundos.setBorder(BorderFactory.createBevelBorder(1));
		cronometroSegundos.setOpaque(true);
		cronometroSegundos.setHorizontalAlignment(JTextField.CENTER);
		cronometroSegundos.setText(String.valueOf(segundos)); // CONVERTION OF VARIABLE SECONDS AND DISPLAYING AS STRING

		textTempo.setBounds(535, 475, 100, 25);
		textTempo.setBackground(new Color(20, 20, 20));
		textTempo.setForeground(new Color(255, 0, 0));
		textTempo.setFont(new Font("MV Boli", Font.PLAIN, 16));
		textTempo.setHorizontalAlignment(JTextField.CENTER);
		textTempo.setText("TEMPO");
		
		/*-------------------------------ADDING FRAMES-----------------------------------*/

		frame.add(textTempo);
		frame.add(cronometroSegundos);
		frame.add(respostaA);
		frame.add(respostaB);
		frame.add(respostaC);
		frame.add(respostaD);
		frame.add(bRespostaA);
		frame.add(bRespostaB);
		frame.add(bRespostaC);
		frame.add(bRespostaD);
		frame.add(areaQuestao);
		frame.add(campoQuestao);
		frame.setVisible(true);

		proximaQuestao();
		
	}
	
	/*-----------------------------------------PROXIMA QUESTAO---------------------------------------*/
	public void proximaQuestao() {

		if (index >= totalQuestoes) { // DETERMINATE IN WICH QUESTION WE ARE ON
			resultadosQuestoes(); // CALL RESULTS METHOD
		} else {
			campoQuestao.setText("Question " + (index + 1)); // CHANGE TEXTFIELD TO QUESTION 1 AND INCREASE INDEX AFTER
															// EVERY QUESTION
			areaQuestao.setText(questoesPartida[index]); // DISPLAY ARRAY OF QUESTIONS IN CERTAIN INDEX
			respostaA.setText(opcoesPartida[index][0]);
			respostaB.setText(opcoesPartida[index][1]);
			respostaC.setText(opcoesPartida[index][2]);
			respostaD.setText(opcoesPartida[index][3]);
			timer.start();
		}

	}
	
	/*------------------------------------ACTION PERFORMED PARTIDA-----------------------------------*/	
	@Override
	public void actionPerformed(ActionEvent e) { // THIS METHOD WILL TRIGGER WHEN SOME BUTTON IS CLICKED

		/*---DISABLING BUTTONS---*/
		bRespostaA.setEnabled(false);
		bRespostaB.setEnabled(false);
		bRespostaC.setEnabled(false);
		bRespostaD.setEnabled(false);

		/*---DETERMINATE PRESSED BUTTON AND IF IS THE MATCHING ANSWER---*/
		if (e.getSource() == bRespostaA) { // BUTTON A
			respostas = 'A';
			if (respostas == respostasPartida[index]) {
				chutesCertos++;
			}
		}

		if (e.getSource() == bRespostaB) { // BUTTON B
			respostas = 'B';
			if (respostas == respostasPartida[index]) {
				chutesCertos++;
			}
		}

		if (e.getSource() == bRespostaC) { // BUTTON C
			respostas = 'C';
			if (respostas == respostasPartida[index]) {
				chutesCertos++;
			}
		}

		if (e.getSource() == bRespostaD) { // BUTTON D
			respostas = 'D';
			if (respostas == respostasPartida[index]) {
				chutesCertos++;
			}
		}
		mostrarRespostas();

	}
	
	/*---------------------------------------MOSTRAR RESPOSTAS---------------------------------------*/
	public void mostrarRespostas() { // DISPLAY ANSWER METHOD

		timer.stop();
		bRespostaA.setEnabled(false);
		bRespostaB.setEnabled(false);
		bRespostaC.setEnabled(false);
		bRespostaD.setEnabled(false);

		if (respostasPartida[index] != 'A')
			respostaA.setForeground(new Color(225, 0, 0));

		if (respostasPartida[index] != 'B')
			respostaB.setForeground(new Color(225, 0, 0));

		if (respostasPartida[index] != 'C')
			respostaC.setForeground(new Color(225, 0, 0));

		if (respostasPartida[index] != 'D')
			respostaD.setForeground(new Color(225, 0, 0));

		Timer pause = new Timer(2000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				respostaA.setForeground(new Color(25, 255, 0));
				respostaB.setForeground(new Color(25, 255, 0));
				respostaC.setForeground(new Color(25, 255, 0));
				respostaD.setForeground(new Color(25, 255, 0));

				respostas = ' ';
				segundos = 10;
				cronometroSegundos.setText(String.valueOf(segundos));
				bRespostaA.setEnabled(true);
				bRespostaB.setEnabled(true);
				bRespostaC.setEnabled(true);
				bRespostaD.setEnabled(true);
				index++;
				proximaQuestao();

			}

		});

		pause.setRepeats(false); // UNABLE METHOD TO REPEAT
		pause.start();

	}

	public void resultadosQuestoes() {

		bRespostaA.setEnabled(false);
		bRespostaB.setEnabled(false);
		bRespostaC.setEnabled(false);
		bRespostaD.setEnabled(false);

		resultado = (int) ((chutesCertos / (double) totalQuestoes) * 100);

		campoQuestao.setText("RESULTS!");
		areaQuestao.setText("");
		respostaA.setText("");
		respostaB.setText("");
		respostaC.setText("");
		respostaD.setText("");

		numeroAcertos.setText("(" + chutesCertos + "/" + totalQuestoes + ")");
		porcentagemAcertos.setText(resultado + "%");

		frame.add(numeroAcertos);
		frame.add(porcentagemAcertos);

	}

	
}

/* CODIGO PROPRIEDADE DE QUIZZOINC 
 * 
 * PROIBIDO A COPIA OU VENDA
 * 
 * CODDERS:
 * Marcelo Laurentino Costa Melo        RA: 321220650
 * Gabriel Lucas de Paula Gomes         RA: 321221122
 * Tulho Henrique de Oliveira Melo      RA: 321213318
 * 
 */





//FIM DO CODIGO	
