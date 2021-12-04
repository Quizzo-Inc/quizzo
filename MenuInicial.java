package QuiZzoInc;

import java.util.ArrayList;

public class MenuInicial {
	
	private String idMenuInicial;
	private ArrayList<String> botaoMenu;
    
    
    public MenuInicial() {
    	 	
    }
    
    public void BotaoMenu(ArrayList<String> botaoMenu) {
    	this.botaoMenu = botaoMenu;
    }

	public String getIdMenuInicial() {
		return idMenuInicial;
	}

	public void setIdMenuInicial(String idMenuInicial) {
		this.idMenuInicial = idMenuInicial;
	}

	public ArrayList<String> getBotaoMenu() {
		return botaoMenu;
	}

	public void setBotaoMenu(ArrayList<String> botaoMenu) {
		this.botaoMenu = botaoMenu;
	}
    
    
    
    

    
}
