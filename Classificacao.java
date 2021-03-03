package Projeto;

public enum Classificacao {

	/* Enums */ 
	CARTAOCREDITO("Cartão de crédito"), CARTAODEBITO("Cartão de débito"),  DINHEIRO("Dinheiro"), APROXIMACAO("Aproximação");

	/* ATRIBUTOS */
	private String classificacao;

	/* Métodos */

	Classificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	String getTipoDeConta() {
		return classificacao;
	}
}
