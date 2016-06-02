
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class CampeonatoApp {
	
	private static final String COMANDO_ENCERRAR = "fim";
	private static final NumberFormat formatador =  NumberFormat.getNumberInstance();
	static 
	{	formatador.setMinimumIntegerDigits(2);	
	}

	public static void main(String[] args) throws ParseException 
	{	Scanner teclado = new Scanner(System.in);
		Campeonato campeonato = new Campeonato();
		cadastrarTimes(teclado, campeonato);
		System.out.println();
		cadastrarPartidas(teclado, campeonato);
		System.out.println();
		imprimirTabela(campeonato);
	}

	private static void cadastrarTimes(Scanner teclado, Campeonato campeonato) 
	{	System.out.println("Cadastrando times");
		System.out.println("'" + COMANDO_ENCERRAR + "' p/ encerrar cadastro");
		System.out.print("Nome do time: ");
		String nome = teclado.nextLine();
		while (!nome.equals(COMANDO_ENCERRAR))
		{	System.out.print("Apelido: ");
			String apelido = teclado.nextLine();
			System.out.print("Nome oficial: ");
			String nomeOficial = teclado.nextLine();
			Time time = new Time(nome, apelido, nomeOficial);
			campeonato.adicionarTime(time);
			System.out.println("Time cadastrado com sucesso");
			System.out.println();
			System.out.print("Nome do time: ");
			nome = teclado.nextLine();
		}
	}
	
	private static void cadastrarPartidas(Scanner teclado, Campeonato campeonato) throws ParseException 
	{	System.out.println("Cadastrando partidas");
		System.out.println("'" + COMANDO_ENCERRAR + "' p/ encerrar cadastro");
		System.out.print("Data da partida: ");
		String dataString = teclado.nextLine();
		while (!dataString.equals(COMANDO_ENCERRAR))
		{	Date data = DateFormat.getDateInstance().parse(dataString);
			System.out.print("Nome do time da casa: ");
			String nomeTime = teclado.nextLine();
			Time timeCasa = campeonato.getTime(nomeTime);
			System.out.print("Quantidade de gols do time da casa: ");
			int golsCasa = Integer.parseInt(teclado.nextLine());
			System.out.print("Nome do time visitante: ");
			String nomeVisitante = teclado.nextLine();
			Time timeVisitante = campeonato.getTime(nomeVisitante);
			System.out.print("Quantidade de gols do time visitante: ");
			int golsVisitante = Integer.parseInt(teclado.nextLine());
			Partida partida = new Partida(data, timeCasa, golsCasa, timeVisitante, golsVisitante);
			campeonato.adicionarPartida(partida);
			System.out.println("Partida cadastrada com sucesso");
			System.out.println();
			System.out.print("Data da partida: ");
			dataString = teclado.nextLine();
		}
	}
	
	private static void imprimirTabela(Campeonato campeonato) {
		Time[] times = campeonato.getTimes();
		for (int i = 0; i < times.length;i ++) {
			Time time  = times[i];
			if (time != null)
			{	String pontos = formatador.format(time.getPontos());
				String saldo =  formatador.format(time.getSaldoGols());
				System.out.println(pontos + " " + saldo + " " + time.getNome() + "(" + time.getApelido() + ")");
			}	
		}
	}
}