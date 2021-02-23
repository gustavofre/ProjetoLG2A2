package Projeto;

public enum TipoDeConta {

	CONTACORRENTE("Conta Corrente"),
	CONTAPOUPACA("Conta Poupança");
	
	private String tipoDeConta;
	
	TipoDeConta(String tipoDeConta){
		this.tipoDeConta = tipoDeConta;
	}
	
	String getTipoDeConta() {
		return tipoDeConta;
	}
}
