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
		Movimentacao c2m1 = new Movimentacao("4500");
		Lancamentos c2l1 = new Lancamentos(agora , c2m1, "Recebimento sal�rio", Receitas.SALARIO.receitas, Classificacao.DINHEIRO.classificacao);
		System.out.println(c2l1);
		
		Movimentacao c2m2 = new Movimentacao("-3000");
		Lancamentos c2l2 = new Lancamentos(agora, c2m2, "Aluguel m�s mar�o", Despesas.ALUGUEL.despesas, Classificacao.TRANSFERENCIABANCARIA.classificacao);
		System.out.println(c2l2);
		
		
		Movimentacao c2m3 = new Movimentacao("-200");
		Lancamentos c2l3 = new Lancamentos (agora, c2m3, "Compra de uma cal�a", Despesas.OUTROS.despesas, Classificacao.CARTAODEBITO.classificacao);
		System.out.println(c2l3); 
		
		Movimentacao c2m4 = new Movimentacao ("-100");
		Lancamentos c2l4 = new Lancamentos (agora, c2m4, "Almo�o fora", Despesas.DIVERSAO.despesas, Classificacao.DINHEIRO.classificacao);
		System.out.println(c2l4);
		
		Movimentacao c2m5 = new Movimentacao ("-500");
		Lancamentos c2l5 = new Lancamentos (agora, c2m5, "Transfer�ncia computador", Despesas.OUTROS.despesas, Classificacao.TRANSFERENCIABANCARIA.classificacao);
		System.out.println(c2l5);
		
		
		
	}

}
