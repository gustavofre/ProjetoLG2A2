package Projeto;

public enum Classificacao {

	/* Enums */ 
	CARTAOCREDITO("Cart�o de cr�dito"), CARTAODEBITO("Cart�o de d�bito"),  DINHEIRO("Dinheiro"), APROXIMACAO("Aproxima��o");

	/* ATRIBUTOS */
	private String classificacao;

	/* M�todos */

	Classificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	String getTipoDeConta() {
		return classificacao;
	}
}
