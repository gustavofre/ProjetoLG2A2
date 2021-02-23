package Projeto;

public enum ReceitasFixas {

	SALARIO("Salário");
	
	private String salario;
	
	ReceitasFixas(String salario){
		this.salario = salario;
	}
	
	String getSalario() {
		return salario;
	}
	
	
}
