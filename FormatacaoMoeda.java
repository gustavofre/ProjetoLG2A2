package Projeto;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class FormatacaoMoeda {

	private BigDecimal valor;
	private static final String UNIDADE_MONETARIA = "R$";
	private static final DecimalFormat FORMATO = new DecimalFormat(UNIDADE_MONETARIA + " #,###,##0.00");

	public FormatacaoMoeda(String valor) {
		this.setValor(new BigDecimal(valor));
	}

	public BigDecimal getValor() {
		return valor;
	}

	public String getValorFormatado() {
		return FORMATO.format(getValor());
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}
