package Projeto;

import java.math.BigDecimal;

public class ContaPoupanca extends ContaBancaria{
	
	private BigDecimal jurosPoupanca;

	public ContaPoupanca (BigDecimal jurosPoupanca, int agencia, int conta){
		super(agencia, conta);
		this.jurosPoupanca = jurosPoupanca;
	}
	
	public BigDecimal getJurosPoupanca() {
		return jurosPoupanca;
	}

	public void setJurosPoupanca(BigDecimal jurosPoupanca) {
		this.jurosPoupanca = jurosPoupanca;
	}
	
	

}
