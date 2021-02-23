package Projeto;

import java.math.BigDecimal;

public class ContaCorrente extends ContaBancaria{

	private BigDecimal tarifaBancaria;

	public ContaCorrente ( BigDecimal tarifaBancaria, int conta, int agencia) {
		super(conta, agencia);
		this.tarifaBancaria = tarifaBancaria;
	}
	
	public BigDecimal getTarifaBancaria() {
		return tarifaBancaria;
	}

	public void setTarifaBancaria(BigDecimal tarifaBancaria) {
		this.tarifaBancaria = tarifaBancaria;
	}
	
	
}
