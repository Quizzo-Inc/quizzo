//AUGUSTO CÉSAR EMANUEL ROSA DE ASSIS.
package Quizzo;

public class MenuIncial {
    private int codigoMenu;
    private boolean iniciarJogo = false;
    private String informacoesDevs;
    private String explicarJogo;
    private boolean sair = false;

// INÍCIO MÉTODOS DEPENDENTES DE OUTRAS CLASSES

    public boolean selecionarPartida() { //" REVISAR "
    //" REVISAR "
    }
    
    public void setidPartida(idPartida = String){ 
        this.idPartida = idPartida;
    }
    
    public String getIdJogador(){ // DEPENDE DA CLASSE JOGADOR
        return IdJogador;    
    }
    
// FIM DOS MÉTODOS DEPENDENTES DE OUTRAS CLASSES

// INICIO MÉTODO GET

    public int getCodigoMenu() {
        return codigoMenu;
    }

    public boolean isIniciarJogo() {
        return iniciarJogo;
    }

    public String getInformacoesDevs() {
        return informacoesDevs;
    }

    public String getExplicarJogo() {
        return explicarJogo;
    }

    public boolean isSair() {
        return sair;
    }
// FIM MÉTODOS GET

// INÍCIO MÉTODOS SET

    public void setCodigoMenu(int codigoMenu) {
        this.codigoMenu = codigoMenu;
    }

    public void setIniciarJogo(boolean iniciarJogo) {
        this.iniciarJogo = iniciarJogo;
    }

    public void setInformacoesDevs(String informacoesDevs) {
        this.informacoesDevs = informacoesDevs;
    }

    public void setExplicarJogo(String explicarJogo) {
        this.explicarJogo = explicarJogo;
    }

    public void setSair(boolean sair) {
        this.sair = sair;
    }
    
// FIM DO MÉTODO SET
    
}
    
