package Projeto;

public enum Classificacao {
	
	/*Enums */
	CONTACORRENTE("Conta Corrente"),
	CONTAPOUPACA("Conta Poupan�a"),
	RENDIMENTOACOES("Rendimento provindo de a��es"),
	JUROSPOUPANCA("Juros da poupan�a"),
	SALARIO("Sal�rio"),
	MERCADO("Mercado"),
	TELEFONE("Telefone"),
	CELULAR("Celular"),
	AGUA("�gua"),
	ELETRICIDADE("Eletricidade"),
	DIVERSAO("Diversao"),
	OUTROS("Outros"),
	ALUGUEL("A"),  
	ESCOLA ("Escola"),
	CURSO ("Curso"),
	CONVENIMEDICO ("Conv�nio m�dico"),
	CONVENIOODONTOLOGICO ("Conv�nio odontol�gico"),
	CARTAOCREDITO ("Cart�o de cr�dito"),
	CARTAODEBITO("Cart�o de d�bito");
	
	
	/* ATRIBUTOS*/
	private String classificacao;
	
	
	/* M�todos */

	Classificacao(String classificacao){
		this.classificacao= classificacao;
	}
	
	String getTipoDeConta() {
		return classificacao;
	}
	
}
