package Projeto;

public enum Receitas {
	
	//Enum
	RENDIMENTOACOES("Rendimento provindo de a��es"),
	JUROSPOUPANCA("Juros da poupan�a"), SALARIO("Sal�rio");
	
	//Atributo
	String receitas;
	
	//M�todos
	Receitas(String rece) {
		this.receitas = rece;
	} 
	
	String tipoReceita() {
		return receitas;
	}
}
