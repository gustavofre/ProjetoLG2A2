package Projeto;

public enum ReceitasFixas {

	SALARIO("Sal�rio");
	
	private String salario;
	
	ReceitasFixas(String salario){
		this.salario = salario;
	}
	
	String getSalario() {
		return salario;
	}
	
	
}
