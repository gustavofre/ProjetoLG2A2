package Projeto;

public enum Despesas {

	//Enums
	MERCADO("Mercado"), TELEFONE("Telefone"),  CELULAR("Celular"), 
	AGUA("Água"), ELETRICIDADE("Eletricidade"), DIVERSAO("Diversao"), 
	OUTROS("Outros"),  ALUGUEL("Aluguel"), ESCOLA("Escola"), CURSO("Curso"), 
	CONVENIMEDICO("Convênio médico"),  CONVENIOODONTOLOGICO("Convênio odontológico");

	//Atributos
	protected String despesas;
	
	//Métodos
	Despesas(String desp) {
		this.despesas = desp;
	}
	
	public String tipoDespesa() {
		return despesas;
	}
}
