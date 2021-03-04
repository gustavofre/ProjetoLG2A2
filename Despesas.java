package Projeto;

public enum Despesas {

	//Enums
	MERCADO("Mercado"), TELEFONE("Telefone"),  CELULAR("Celular"), 
	AGUA("�gua"), ELETRICIDADE("Eletricidade"), DIVERSAO("Diversao"), 
	OUTROS("Outros"),  ALUGUEL("Aluguel"), ESCOLA("Escola"), CURSO("Curso"), 
	CONVENIMEDICO("Conv�nio m�dico"),  CONVENIOODONTOLOGICO("Conv�nio odontol�gico");

	//Atributos
	protected String despesas;
	
	//M�todos
	Despesas(String desp) {
		this.despesas = desp;
	}
	
	public String tipoDespesa() {
		return despesas;
	}
}
