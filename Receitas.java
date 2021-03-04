package Projeto;

public enum Receitas {
	
	//Enum
	RENDIMENTOACOES("Rendimento provindo de ações"), RENDIMENTORENDA("Rendimento de renda fixa"),
	JUROSPOUPANCA("Juros da poupança"), SALARIO("Salário");
	
	//Atributo
	protected String receitas;
	
	//Métodos
	Receitas(String rece) {
		this.receitas = rece;
	} 
	
	String tipoReceita() {
		return receitas;
	}
}
