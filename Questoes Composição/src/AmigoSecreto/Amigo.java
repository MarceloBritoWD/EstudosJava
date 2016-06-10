
public class Amigo {
	private String nome;
	private char sexo;
	private long telefone;
	private String email;
	
	public Amigo(String nome, char sexo, long telefone, String email){
		this.nome = nome;
		this.sexo = sexo;
		this.telefone = telefone;
		this.email = email;
	}
	
	
	public String getNome(){
		return nome;
	}
	public char getSexo(){
		return sexo;
	}
	public long getTelfone(){
		return telefone;
	}
	public String getEmail(){
		return email;
	}
	
	
}
