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
		Movimentacao c2m1 = new Movimentacao("-27");
		Lancamentos c2l1 = new Lancamentos(agora , c2m1, "Padaria, café da manhã", Classificacao.CARTAODEBITO.classificacao);
		System.out.println(c2l1);
		
		Movimentacao c2m2 = new Movimentacao("-3000");
		Lancamentos c2l2 = new Lancamentos(agora, c2m2, "Aluguel março", Despesas.ALUGUEL.despesas);
		System.out.println(c2l2);
		 
	}

}
