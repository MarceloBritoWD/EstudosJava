
public class Campeonato {
	private static final int TAMANHO_INICIAL = 10;
	private int posTime = 0;
	Time[] times = new Time[TAMANHO_INICIAL];
	private int posPartida = 0;
	Partida[] partidas = new Partida[TAMANHO_INICIAL];

	public void adicionarTime(Time time){
		this.times[posTime] = time;
		posTime++;
	}
	
	public void adicionarPartida(Partida partida){
		this.partidas[posPartida] = partida;
		posPartida++;
	}
	
	
	public Time getTime(String nomeTime){
		for (int i = 0; i < times.length; i++) {
			if (times[i].getNome().equals(nomeTime)) {
				return times[i];
			}
		}
		return null;
	}
	
	
	public Time[] getTimes(){
		return this.times;

	}
	
}
