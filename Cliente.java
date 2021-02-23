package Projeto;

public class Cliente {

	private String nome;
	private String cpf;
	private String usuario;
	private int idade;
	private ContaCorrente contaCorrente;
	private ContaPoupanca contaPoupanca;
	
	/* Construtor para cria��o de um novo usu�rio */ 
	Cliente (String nome, String cpf, String usuario, int idade){
		this.nome = nome;
		this.cpf = cpf;
		this.usuario = usuario;
		this.idade = idade;
	}
	
	/* Construtor para a cria��o de movimenta��o */
	Cliente (String nome, String usuario){
		this.nome = nome;
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
}
