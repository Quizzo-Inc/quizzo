//AUGUSTO CÉSAR EMANUEL ROSA DE ASSIS.
package Quizzo;

public class MenuEscolhaPersonagem {
    private String idEscolhaPersonagem;
    private String personagemCadastrados;
    private int totalPersonagens;
    private int escolha;
    private boolean escolhido;

// INÍCIO DOS MÉTODOS DEPENDENTES DE OUTRAS CLASSES

    public String getPersonagemId(){
        return PersonagemId;
    }
    
    public String getPartidaId() {
        return PartidaId;    
    }
    
    public String getJogadorId(){
        return JogadorId;
    }
    
// FIM DOS MÉTODOS DEPENDENTES DE OUTRAS CLASSES    
    
// INÍCIO DOS MÉTODOS GET E SET
    
    public String getIdEscolhaPersonagem() {
        return idEscolhaPersonagem;
    }

    public void setIdEscolhaPersonagem(String idEscolhaPersonagem) {
        this.idEscolhaPersonagem = idEscolhaPersonagem;
    }

    public String getPersonagemCadastrados() {
        return personagemCadastrados;
    }

    public void setPersonagemCadastrados(String personagemCadastrados) {
        this.personagemCadastrados = personagemCadastrados;
    }

    public int getTotalPersonagens() {
        return totalPersonagens;
    }

    public void setTotalPersonagens(int totalPersonagens) {
        this.totalPersonagens = totalPersonagens;
    }

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

    public boolean isEscolhido() {
        return escolhido;
    }

    public void setEscolhido(boolean escolhido) {
        this.escolhido = escolhido;
    }
// FIM DOS MÉTODOS GET E SET  

}