
public class Candidato {
	private String nome;
	private int numero;
	private String partido;
	private int votos = 0;
	
	public Candidato(String nome, int numero, String partido){
		this.nome = nome;
		this.numero = numero;
		this.partido = partido;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}

	public void adicionarVoto() {
		this.votos++;
	}

	public int getVotos() {
		return this.votos;
	}

}
