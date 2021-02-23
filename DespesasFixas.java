package Projeto;

public enum DespesasFixas {
	
	ALUGUEL("A"),  
	ESCOLA ("Escola"),
	CURSO ("Curso"),
	CONVENIMEDICO ("Convênio Médico"),
	CONVENIOODONTOLOGICO ("Convênio Odontológico"),
	OUTROS("Outros");
	
	private String valor;

	DespesasFixas(String valor) {
		this.valor = valor;
	}

	String getValor() {
		return valor;
	}
	
	
}
