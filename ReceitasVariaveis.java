package Projeto;

public enum ReceitasVariaveis {

	RENDIMENTOACOES("Rendimento provindo de ações"),
	JUROSPOUPANCA("Juros da poupança");
	
	private String receitasVariaveis;
	
	ReceitasVariaveis (String receitasVariaveis){
		this.receitasVariaveis = receitasVariaveis;
	}

	String getReceitasVariaveis(){
		return  receitasVariaveis;
	}
}
	
