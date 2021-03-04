package Projeto;

public enum Classificacao {

	/* Enums */ 
	CARTAOCREDITO("Cart�o de cr�dito"), CARTAODEBITO("Cart�o de d�bito"),  DINHEIRO("Dinheiro"), BOLETO("Boleto"),
	APROXIMACAO("Aproxima��o"), PIX("Pix"), TRANSFERENCIABANCARIA ("Transfer�ncia banc�ria");

	/* ATRIBUTOS */
	protected String classificacao;

	/* M�todos */

	Classificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	String getTipoDeConta() {
				return classificacao;
	}
}
