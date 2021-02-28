package Projeto;

public enum Receitas {
	
	//Enum
	RENDIMENTOACOES("Rendimento provindo de ações"),
	JUROSPOUPANCA("Juros da poupança"), SALARIO("Salário");
	
	//Atributo
	String receitas;
	
	//Métodos
	Receitas(String rece) {
		this.receitas = rece;
	} 
	
	String tipoReceita() {
		return receitas;
	}
}
