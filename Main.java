package Projeto;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		
		LocalDateTime agora = LocalDateTime.now();
					
		Cliente c1 = new Cliente("Gabriel", "Gab");
		
		Movimentacao m1 = new Movimentacao("-150");
		m1.somarCom("170");
		System.out.println(m1.getValorFormatado());
		System.out.println("Tipo: " + Despesas.AGUA.despesas);
		System.out.println();
		
		
		Cliente c2 = new Cliente("Gustavo", "gus");
		HorarioLancamento c2h1 = new HorarioLancamento(agora);
		Movimentacao c2m1 = new Movimentacao("2700");
		Lancamentos c2l1 = new Lancamentos(c2h1, c2m1, "Padaria, café da manhã", Classificacao.CARTAODEBITO);
		System.out.println(c2l1);
		
		 
	}

}
