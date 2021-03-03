package Projeto;

public class Cliente {

	private String nome;
	private String cpf;
	private String usuario;
	private int idade;

	/* Construtor para a criação de movimentação */
	Cliente(String nome, String usuario) {
		this.nome = nome;
		this.usuario = usuario;
		System.out.println("Usuário: " +usuario);
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void status() {
		System.out.println("Nome: " +this.nome);
		System.out.println("Usuário: " +this.usuario);
		System.out.println("CPF: " +this.cpf);
		System.out.println("Idade: " +this.idade);
		
	}
}
