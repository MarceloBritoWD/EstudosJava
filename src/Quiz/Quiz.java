
public class Quiz {
	private static final int TAMANHO_INICIAL = 3;
	private Pergunta[] perguntas = new Pergunta[TAMANHO_INICIAL];
	private int posPergunta = 0;
	private int proxPergunta = -1;
	private int pontuacao = 0;
	private int proxPalpite = 0;
	
	public void adicionarPergunta(Pergunta pergunta){
		this.perguntas[posPergunta] = pergunta;
		posPergunta++;
	}	
	
	public Pergunta getProximaPergunta(){
		proxPergunta++;
		return perguntas[proxPergunta];
		
	}
	
	public boolean tentarPalpite(char palpite){
		if (perguntas[proxPalpite].getCorreta() == palpite) {
			pontuacao++;
			proxPalpite++;
			return true;				
		} else {
			proxPalpite++;
			return false;
		}
	}
	
	public int getPontuacao(){
		return pontuacao;
	}
}
