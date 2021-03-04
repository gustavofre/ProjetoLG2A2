package Projeto;

public enum Receitas {
	
	//Enum
	RENDIMENTOACOES("Rendimento provindo de a��es"), RENDIMENTORENDA("Rendimento de renda fixa"),
	JUROSPOUPANCA("Juros da poupan�a"), SALARIO("Sal�rio");
	
	//Atributo
	protected String receitas;
	
	//M�todos
	Receitas(String rece) {
		this.receitas = rece;
	} 
	
	String tipoReceita() {
		return receitas;
	}
}
