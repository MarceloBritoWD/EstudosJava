package Agenda;


public class Agenda {
	private static final int TAMANHO_INICIAL = 5;
	private Contato[] contatos = new Contato[TAMANHO_INICIAL];
	private int posContatos = 0;
	
	
	
	public void adicinarContato(Contato contato){
		this.contatos[posContatos] = contato;
		posContatos++;
	}
	
	
	public Contato[] getContatos(String nome){
		Contato[] listaResultados = new Contato[TAMANHO_INICIAL];
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i].getNome() == nome) {
				listaResultados[i] = contatos[i];
			}
			return listaResultados;
		}
		return null;
	}
	
	public Contato[] getContatos(){		
		return this.contatos;
	}
}
