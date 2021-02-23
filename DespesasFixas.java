package Projeto;

public enum DespesasFixas {
	
	ALUGUEL("A"),  
	ESCOLA ("Escola"),
	CURSO ("Curso"),
	CONVENIMEDICO ("Conv�nio M�dico"),
	CONVENIOODONTOLOGICO ("Conv�nio Odontol�gico"),
	OUTROS("Outros");
	
	private String valor;

	DespesasFixas(String valor) {
		this.valor = valor;
	}

	String getValor() {
		return valor;
	}
	
	
}
