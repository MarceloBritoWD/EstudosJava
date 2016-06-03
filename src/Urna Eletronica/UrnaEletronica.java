
public class UrnaEletronica {
	private static final int TAMANHO_INICIAL = 2;
	Candidato[] candidatos = new Candidato[TAMANHO_INICIAL];
	private int posCandidato = 0;
	private static final int DOBRO = 2;
	
	public void adicionarCandidato(Candidato candidato){
		if (posCandidato == candidatos.length) {
			Candidato[] novoArray = new Candidato[posCandidato * DOBRO];
			
			for (int i = 0; i < candidatos.length; i++) {
				novoArray[i] = candidatos[i];
			}
			this.candidatos = novoArray;			
		}
		
		this.candidatos[posCandidato] = candidato;
		posCandidato++;		
	}
	
	public Candidato getCandidato(int numero){
		for (int i = 0; i < candidatos.length; i++) {
			if (candidatos[i].getNumero() == numero) {
				return candidatos[i];
				
			}
			
		}	return null;
	}
	
	
	
	public Candidato[] getCandidatos(){
		return this.candidatos;
	}
	
}
