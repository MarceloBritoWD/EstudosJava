import java.util.Scanner;

public class AmigoSecretoApp {
	private static final String COMANDO_ENCERRAR = "fim";

	public static void main(String[] args) {
		
		System.out.println("Vamos fazer um amigo secreto!!");
		System.out.println("Cadastre um amigo agora!");
		System.out.println();
		
		AmigoSecreto amigoSecreto = new AmigoSecreto();
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Nome do sujeito: ");
		
		String nome = teclado.nextLine();
		while(!nome.equals(COMANDO_ENCERRAR)){
			System.out.print("Qual o sexo do seu amigo (M/F)? ");
			char sexo = teclado.nextLine().charAt(0);		
			System.out.print("Qual o telefone do cidadão? ");
			long telefone = Long.parseLong(teclado.nextLine());					
			System.out.print("Qual o e-mail? ");
			String email = teclado.nextLine();
			
			Amigo amigo = new Amigo(nome, sexo, telefone, email);
			amigoSecreto.adicionarAmigo(amigo);
			
			System.out.println();
			System.out.println("Cadastre mais amigo agora!");
			System.out.println("Comando 'fim' para encerrar cadastros;");
			System.out.print("Nome: ");
			nome = teclado.nextLine();
			
		}
		
		
		
		
		teclado.close();
		
	}

}
