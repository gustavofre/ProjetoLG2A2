package Projeto;

public enum ReceitasVariaveis {

	RENDIMENTOACOES("Rendimento provindo de a��es"),
	JUROSPOUPANCA("Juros da poupan�a");
	
	private String receitasVariaveis;
	
	ReceitasVariaveis (String receitasVariaveis){
		this.receitasVariaveis = receitasVariaveis;
	}

	String getReceitasVariaveis(){
		return  receitasVariaveis;
	}
}
	
