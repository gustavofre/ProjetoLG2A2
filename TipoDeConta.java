package Projeto;

public enum TipoDeConta {

	CONTACORRENTE("Conta Corrente"),
	CONTAPOUPACA("Conta Poupan�a");
	
	private String tipoDeConta;
	
	TipoDeConta(String tipoDeConta){
		this.tipoDeConta = tipoDeConta;
	}
	
	String getTipoDeConta() {
		return tipoDeConta;
	}
}
