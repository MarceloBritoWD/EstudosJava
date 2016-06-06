package Quiz;


public class Pergunta {
	private String enunciado;
	private char correta;
	private String[] respostas = new String[2];
	private int posResposta = 0;
	
	public Pergunta(String enunciado){
		this.enunciado = enunciado;
	}
	
	public void adicionarResposta(String resposta){
		this.respostas[posResposta] = resposta;
		posResposta++;
	}
	
	public void setCorreta(char correta){
		this.correta = correta;
	}
	public char getCorreta(){
		return this.correta;
	}
	
	
	public String getEnunciado(){
		return enunciado;		
	}

	public String getResposta(int i) {
		return this.respostas[i];
	}

	
}
