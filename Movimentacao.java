package Projeto;

import java.math.BigDecimal;

public class Movimentacao extends FormatacaoMoeda{
	
	Movimentacao(String valor) {
		super(valor);
	}
	
	public void somarCom (String valor) {
		setValor(super.getValor().add(new BigDecimal(valor)));
	}
	
	


	
	
}
