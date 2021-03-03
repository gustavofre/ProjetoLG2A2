package Projeto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Lancamentos {

	private Movimentacao valor;
	private HorarioLancamento data;
	private String descricao; 
	private Classificacao classificacao;
	
	Lancamentos ( HorarioLancamento hora,  Movimentacao string, String descricao, Classificacao classificacao){
		this.data = hora;
		this.valor = string;
		this.descricao = descricao;
		this.classificacao = classificacao;
	}
	
	@Override
	public String toString() {
		return data + " - " + valor + " - " + descricao + " - " + classificacao;
	}
	
	
	
}
