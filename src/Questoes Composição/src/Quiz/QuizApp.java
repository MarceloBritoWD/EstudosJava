package Quiz;

import java.util.Scanner;

public class QuizApp {
	
	private static final int QTD_RESPOSTAS = 2;
	private static final String COMANDO_ENCERRAR = "fim";

	public static void main(String[] args) {
		//Construção dos objetos necessários 
		Scanner teclado = new Scanner(System.in);
		Quiz quiz = new Quiz();
		
		//Cadastro de perguntas
		cadastrarPerguntas(teclado, quiz);
		
		//Limpar a tela
		for (int i = 0; i < 80; i++) {
			System.out.println();
		}
		
		//Começar o jogo
		jogarQuiz(teclado, quiz);
	}

	private static void jogarQuiz(Scanner teclado, Quiz quiz) {
		Pergunta pergunta = quiz.getProximaPergunta();
		while (pergunta != null)
		{	System.out.println(pergunta.getEnunciado());
			for (int i = 0; i <= 1; i++) 
			{	System.out.println(pergunta.getResposta(i));
			}
			System.out.println("");
			System.out.print("Seu palpite: ");
			char palpite = teclado.nextLine().charAt(0);
			boolean acertou = quiz.tentarPalpite(palpite);
			if (acertou)
			{	System.out.println("Você acertou }:-)");
			} else {
				System.out.println("Você errou }:-P");
			}
			System.out.println("Pontos: " + quiz.getPontuacao());
			pergunta = quiz.getProximaPergunta();
			
		}
		System.out.println("Pontuação final: " + quiz.getPontuacao());
	}

	private static void cadastrarPerguntas(Scanner teclado, Quiz quiz) {
		String enunciado = leEnunciado(teclado);
		while (!enunciado.equals(COMANDO_ENCERRAR))
		{	Pergunta pergunta = new Pergunta(enunciado);
			for (int i = 0; i < QTD_RESPOSTAS; i++) 
			{	String resposta = leResposta(teclado);
				pergunta.adicionarResposta(resposta);
			}
			System.out.println("Digite a opção correta: ");
			char correta =  teclado.nextLine().charAt(0);
			pergunta.setCorreta(correta);
			quiz.adicionarPergunta(pergunta);
			System.out.println();
			enunciado = leEnunciado(teclado);
		}
	}

	private static String leResposta(Scanner teclado) {
		System.out.println("Digite a resposta: ");
		return teclado.nextLine();
	}

	private static String leEnunciado(Scanner teclado) 
	{	System.out.println("Digite a pergunta ['fim' p/ encerrar]: ");
		return teclado.nextLine();
	}
}