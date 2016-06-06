package Agenda;


import java.util.Scanner;

public class AgendaApp {
	
	private static final String COMANDO_ENCERRAR = "fim";

	public static void main(String[] args)
	{	Scanner teclado = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		cadastrarContatos(teclado, agenda);
		System.out.println();
		imprimirContatos(agenda.getContatos());
		System.out.println();
		consultarContatos(teclado, agenda);
	}

	private static void consultarContatos(Scanner teclado, Agenda agenda) {
		System.out.println("Consultando contatos");
		System.out.println("'" + COMANDO_ENCERRAR + "' p/ encerrar consulta");
		System.out.print("Nome: ");
		String nome = teclado.nextLine();
		while (!nome.equals(COMANDO_ENCERRAR))
		{	Contato[] contatos = agenda.getContatos(nome);
			imprimirContatos(contatos);
			System.out.println("Consulta realizada com sucesso");
			System.out.println();
			System.out.print("Nome: ");
			nome = teclado.nextLine();
		}
	}

	private static void imprimirContatos(Contato[] contatos) {
		for (Contato contato : contatos) {
			if (contato != null) {
				System.out.println(contato.toString());
			} else {
				System.out.println("Espaço vazio na agenda :)");
			}
			
		}
	}

	private static void cadastrarContatos(Scanner teclado, Agenda agenda) {
		System.out.println("Cadastrando contatos");
		System.out.println("'" + COMANDO_ENCERRAR + "' p/ encerrar cadastro");
		System.out.print("Nome: ");
		String nome = teclado.nextLine();
		while (!nome.equals(COMANDO_ENCERRAR))
		{	System.out.print("Telefone celular: ");
			long telefoneCelular = Long.parseLong(teclado.nextLine());
			System.out.print("Telefone residencial: ");
			long telefoneResidencial = Long.parseLong(teclado.nextLine());
			System.out.print("Telefone trabalho: ");
			long telefoneTrabalho = Long.parseLong(teclado.nextLine());
			System.out.print("Email: "); 
			String email = teclado.nextLine();
			Endereco endereco = leEndereco(teclado);
			Contato contato = new Contato(nome, telefoneCelular, telefoneResidencial, telefoneTrabalho, email, endereco);
			agenda.adicinarContato(contato);
			System.out.println("Contato cadastrado com sucesso");
			System.out.println();
			System.out.print("Nome: ");
			nome = teclado.nextLine();
		}
	}

	private static Endereco leEndereco(Scanner teclado) {
		System.out.print("Logradouro: ");
		String logradouro = teclado.nextLine();
		System.out.print("Número: ");
		int numero =  Integer.parseInt(teclado.nextLine());
		System.out.print("Complemento: ");
		String complemento = teclado.nextLine();
		System.out.print("Bairro: ");
		String bairro = teclado.nextLine();
		System.out.print("Cidade: "); 
		String cidade = teclado.nextLine();
		System.out.print("Estado: ");
		String estado = teclado.nextLine();
		System.out.print("País: "); 
		String pais = teclado.nextLine();
		Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, estado, pais);
		return endereco;
	}
}