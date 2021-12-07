package br.com.una.quizzo;

import java.net.URL;

import javax.sound.sampled.*;

/*
 * Essa classe implementa a saída de áudio e os respectivos métodos para acionar
 * a execução dos sons no jogo.
 * 
 * @author Tulho melo
 */
public class Som {
	
	public void tocarSom(String arquivoAudio) throws Exception {
        // Lista os mixers e o respectivo principal do computador do usuário
        /*
         * Essa parte é só pra me ajudar a debbugar
		System.out.println("All mixers:");
        for (Mixer.Info m : AudioSystem.getMixerInfo()) {
            System.out.println("    " + m);
        }

        System.out.println("Default mixer: " + AudioSystem.getMixer(null).getMixerInfo());
		*/
		
        URL url = getClass().getResource(arquivoAudio);
        Clip clip;

        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(url);
        clip = AudioSystem.getClip(null);
        // System.out.println(clip.getFormat()); // Para ajudar no debug também.
        clip.open(audioInputStream);

        clip.start();
        do { 
        	Thread.sleep(100); 
        } while (clip.isRunning());
    }
	
	public static void tocarSomInicio() throws Exception {
		(new Som()).tocarSom("inicio.wav");
	}
	
	public static void tocarSomAcerto() throws Exception {
		(new Som()).tocarSom("acerto.wav");
	}
	
	public static void tocarSomErro() throws Exception {
		(new Som()).tocarSom("erro.wav");
	}
}
