package Projeto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lancamentos {

	private String valor;
	private String data;
	private String descricao; 
	private Classificacao classificacao;
	
	Lancamentos ( LocalDateTime hora,  Movimentacao string, String descricao, Classificacao classificacao){
		DateTimeFormatter dtfhora = DateTimeFormatter.ofPattern("dd/MM/YYYY  h:mm a");
		this.data = dtfhora.format(hora);
		this.valor = string.getValorFormatado();
		this.descricao = descricao;
		this.classificacao = classificacao;
	}
	
	@Override
	public String toString() {
		return data + " - " + valor + " - " + descricao + " - " + classificacao;
	}
	
	
	
}
