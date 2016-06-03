
import java.util.Scanner;

public class UrnaEletronicaApp {
	
	private static final String COMANDO_ENCERRAR = "fim";

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		UrnaEletronica urnaEletronica = new UrnaEletronica();
		cadastrarCandidatos(teclado, urnaEletronica);
		System.out.println();
		votarEmCandidatos(teclado, urnaEletronica);
		System.out.println();
		imprimirResultado(urnaEletronica);
	}

	private static void cadastrarCandidatos(Scanner teclado, UrnaEletronica urna) 
	{	System.out.println("Cadastrando candidatos");
		System.out.println("'" + COMANDO_ENCERRAR + "' p/ encerrar cadastro");
		System.out.print("Nome do candidato: ");
		String nome = teclado.nextLine();
		while (!nome.equals(COMANDO_ENCERRAR))
		{	System.out.print("Número: ");
			int numero = Integer.parseInt(teclado.nextLine());
			System.out.print("Partido: ");
			String partido = teclado.nextLine();
			Candidato candidato = new Candidato(nome, numero, partido);
			urna.adicionarCandidato(candidato);
			System.out.println("Candidato cadastrado com sucesso");
			System.out.println();
			System.out.print("Nome do candidato: ");
			nome = teclado.nextLine();
		}
	}
	
	private static void votarEmCandidatos(Scanner teclado,UrnaEletronica urnaEletronica) 
	{	System.out.println("Votação de candidatos");
		System.out.println("'" + COMANDO_ENCERRAR + "' p/ encerrar votação");
		System.out.print("Número: ");
		String numeroString = teclado.nextLine();
		while (!numeroString.equals(COMANDO_ENCERRAR))
		{	int numero = Integer.parseInt(numeroString);
			Candidato candidato = urnaEletronica.getCandidato(numero);
			candidato.adicionarVoto();
			System.out.println("Você votou em " + candidato.getNome() + "(" + candidato.getNumero() + ")");
			System.out.println();;
			System.out.print("Número: ");
			numeroString = teclado.nextLine();
		}
	}
	
	private static void imprimirResultado(UrnaEletronica urnaEletronica) {
		Candidato[] candidatos = urnaEletronica.getCandidatos();
		
		for (int i = 0; i < candidatos.length; i++) {
			if (candidatos[i] != null) {
				System.out.println("Número: " + candidatos[i].getNumero() + ", partido: " + candidatos[i].getPartido() + ", nome: " + candidatos[i].getNome() + ", votação: " + candidatos[i].getVotos());
			}
		}

	}

}