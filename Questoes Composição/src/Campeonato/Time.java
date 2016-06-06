package Campeonato;


public class Time {
	private String nome;
	private String apelido;
	private String nomeOficial;
	private int saldoGols = 0;
	private int pontos = 0;
	
	public Time(String nome, String apelido, String nomeOficial){
		this.nome = nome;
		this.apelido = apelido;
		this.nomeOficial = nomeOficial;
	}

	public String getNome() {
		return this.nome;
	}

	public String getApelido() {
		return this.apelido;
	}
	
	public String getNomeOficial() {
		return nomeOficial;
	}
	
	public int getSaldoGols(){
		return this.saldoGols;
	}
	
	public void setSaldoGols(int add){
		this.saldoGols += add;
	}
		
	public int getPontos(){
		return this.pontos;
	}
	
	public void setPontos(int add){
		this.pontos += add;
	}	

}
