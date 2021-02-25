package Projeto;

public enum Classificacao {
	
	/*Enums */
	CONTACORRENTE("Conta Corrente"),
	CONTAPOUPACA("Conta Poupança"),
	RENDIMENTOACOES("Rendimento provindo de ações"),
	JUROSPOUPANCA("Juros da poupança"),
	SALARIO("Salário"),
	MERCADO("Mercado"),
	TELEFONE("Telefone"),
	CELULAR("Celular"),
	AGUA("Água"),
	ELETRICIDADE("Eletricidade"),
	DIVERSAO("Diversao"),
	OUTROS("Outros"),
	ALUGUEL("A"),  
	ESCOLA ("Escola"),
	CURSO ("Curso"),
	CONVENIMEDICO ("Convênio médico"),
	CONVENIOODONTOLOGICO ("Convênio odontológico"),
	CARTAOCREDITO ("Cartão de crédito"),
	CARTAODEBITO("Cartão de débito");
	
	
	/* ATRIBUTOS*/
	private String classificacao;
	
	
	/* Métodos */

	Classificacao(String classificacao){
		this.classificacao= classificacao;
	}
	
	String getTipoDeConta() {
		return classificacao;
	}
	
}
