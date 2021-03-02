package Projeto;


public class Main {

	public static void main(String[] args) {
			
		Cliente c1 = new Cliente("Gabriel", "Gab");
		c1.getNome(); c1.getUsuario(); c1.setCpf("1245152"); c1.setIdade(20);
		c1.status();
		
		Movimentacao m1 = new Movimentacao("-150");
		System.out.println(m1.getValorFormatado());
		m1.somarCom("170");
		System.out.println(m1.getValorFormatado());
		System.out.println("Tipo: " + Despesas.AGUA.despesas);
		 
	}

}
