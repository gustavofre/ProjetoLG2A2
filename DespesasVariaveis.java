package Projeto;

public enum DespesasVariaveis {

	MERCADO("Mercado"),
	TELEFONE("Telefone"),
	CELULAR("Celular"),
	AGUA("�gua"),
	ELETRICIDADE("Eletricidade"),
	DIVERSAO("Diversao"),
	OUTROS("Outros");
	
	private String valor; 
	
	DespesasVariaveis(String valor){
		this.valor = valor;
	}
	
	String getValor() {
		return valor; 
	}
}
