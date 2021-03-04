package Projeto;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		
		LocalDateTime agora = LocalDateTime.now();
		
		Cliente c1 = new Cliente("Gabriel", "Gab", "88571938383", 20);
		c1.getCpf();
		Movimentacao c1m1 = new Movimentacao("3800");
		Lancamentos c1l1 = new Lancamentos(agora, c1m1, "Recebimento", Receitas.SALARIO.receitas, Classificacao.TRANSFERENCIABANCARIA.classificacao);
		System.out.println(c1l1);
		
		Movimentacao c1m2 = new Movimentacao("-1700");
		Lancamentos c1l2 = new Lancamentos(agora, c1m2, "Renda fixa", Despesas.APLICACAOEMRENDA.despesas , Classificacao.TRANSFERENCIABANCARIA.classificacao);
		System.out.println(c1l2);
		
		Movimentacao c1m3 = new Movimentacao("-172.40");
		Lancamentos c1l3 = new Lancamentos(agora, c1m3, "Conta", Despesas.ELETRICIDADE.despesas, Classificacao.BOLETO.classificacao);
		System.out.println(c1l3);
		
		Movimentacao c1m4 = new Movimentacao("-549.99");
		Lancamentos c1l4 = new Lancamentos(agora, c1m4, "Tênis Jordan One Take II", Despesas.OUTROS.despesas, Classificacao.DINHEIRO.classificacao);
		System.out.println(c1l4);
		
		Movimentacao c1m5 = new Movimentacao("-265");
		Lancamentos c1l5 = new Lancamentos(agora, c1m5, "Presente para a mãe", Despesas.OUTROS.despesas, Classificacao.CARTAODEBITO.classificacao);
		System.out.println(c1l5 + "\n");
		
		
		
		Cliente c2 = new Cliente("Gustavo", "Gus", "74376498298", 26);
		c2.getCpf();
		Movimentacao c2m1 = new Movimentacao("4500");
		Lancamentos c2l1 = new Lancamentos(agora , c2m1, "Recebimento", Receitas.SALARIO.receitas, Classificacao.DINHEIRO.classificacao);
		System.out.println(c2l1);
		
		Movimentacao c2m2 = new Movimentacao("-3000");
		Lancamentos c2l2 = new Lancamentos(agora, c2m2, "Março", Despesas.ALUGUEL.despesas, Classificacao.TRANSFERENCIABANCARIA.classificacao);
		System.out.println(c2l2);
		
		Movimentacao c2m3 = new Movimentacao("-200");
		Lancamentos c2l3 = new Lancamentos (agora, c2m3, "Calça Hering", Despesas.OUTROS.despesas, Classificacao.CARTAODEBITO.classificacao);
		System.out.println(c2l3); 
		
		Movimentacao c2m4 = new Movimentacao ("-100");
		Lancamentos c2l4 = new Lancamentos (agora, c2m4, "Almoço Outback", Despesas.DIVERSAO.despesas, Classificacao.DINHEIRO.classificacao);
		System.out.println(c2l4);
		
		Movimentacao c2m5 = new Movimentacao ("-500");
		Lancamentos c2l5 = new Lancamentos (agora, c2m5, "Banco digital", Despesas.OUTROS.despesas, Classificacao.TRANSFERENCIABANCARIA.classificacao);
		System.out.println(c2l5);
		
		
		
	}

}
