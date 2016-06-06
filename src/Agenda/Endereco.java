
public class Endereco {
	private String logradouro;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	
	public Endereco(String logradouro, int numero, String complemento, String bairro, String cidade, String estado, String pais){
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}
	
	
	
	
	public String getLogradouro(){
		return logradouro;	
	}
	public int getNumero(){
		return numero;	
	}
	public String getComplemento(){
		return complemento;	
	}
	public String getBairro(){
		return bairro;	
	}
	public String getCidade(){
		return cidade;	
	}
	public String getEstado(){
		return estado;	
	}
	public String getPais(){
		return pais;	
	}




	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", complemento=" + complemento
				+ ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", pais=" + pais + "]";
	}

	
	
}
