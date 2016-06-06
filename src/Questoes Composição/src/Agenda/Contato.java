package Agenda;


public class Contato {
	private String nome;
	private long telefoneCelular;
	private long telefoneResidencial;
	private long telefoneTrabalho;
	private String email;
	private Endereco endereco;	
	
	public Contato(String nome, long telefoneCelular, long telefoneResidencial, long telefoneTrabalho, String email, Endereco endereco){
		this.nome = nome;
		this.telefoneCelular = telefoneCelular;
		this.telefoneResidencial = telefoneResidencial;
		this.telefoneTrabalho = telefoneTrabalho;
		this.email = email;
		this.endereco = endereco;
	}
	
	
	
	public String getNome(){
		return nome;
	}
	
	public long getTelefoneCelular(){
		return telefoneCelular;
	}

	public long getTelefoneResidencial(){
		return telefoneResidencial;
	}

	public long getTelefoneTrabalho(){
		return telefoneTrabalho;
	}

	public String getEmail(){
		return email;
	}

	public Endereco getEndereco(){
		return endereco;
	}



	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", telefoneCelular=" + telefoneCelular + ", telefoneResidencial="
				+ telefoneResidencial + ", telefoneTrabalho=" + telefoneTrabalho + ", email=" + email + ", endereco="
				+ endereco.toString() + "]";
	}
	
	

	
}
