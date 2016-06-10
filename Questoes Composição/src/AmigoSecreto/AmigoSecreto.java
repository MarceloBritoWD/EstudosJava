
public class AmigoSecreto {
	private static final int TAMANHO_INICIAL = 4;
	Amigo[] amigos = new Amigo[TAMANHO_INICIAL];
	private int posicao = 0;
	
	
	public void adicionarAmigo(Amigo amigo){
		this.amigos[posicao] = amigo;
		posicao++;
	} 
	
	
	public void gerarPares(){
		
	}
}
