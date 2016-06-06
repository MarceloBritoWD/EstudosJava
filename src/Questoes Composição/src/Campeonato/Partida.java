package Campeonato;

import java.util.Date;

public class Partida {
	public static final int VITORIA = 3;
	public static final int EMPATE = 1;
	
	public Date data;
	public Time timeCasa;
	public int golsCasa;
	public Time timeVisitante;
	public int golsVisitante;
	
	public Partida(Date data, Time timeCasa, int golsCasa, Time timeVisitante, int golsVisitante){	
		this.data = data;
		this.timeCasa = timeCasa;
		this.golsCasa = golsCasa;
		this.timeVisitante = timeVisitante;
		this.golsVisitante = golsVisitante;
		processarPartida();
	}
	
	public void processarPartida(){
		if (golsCasa > golsVisitante) {
			this.timeCasa.setPontos(VITORIA);
		} else if(golsCasa < golsVisitante){
			this.timeVisitante.setPontos(VITORIA);
		} else {
			this.timeCasa.setPontos(EMPATE);;
			this.timeVisitante.setPontos(EMPATE);
		}		
		this.timeCasa.setSaldoGols(golsCasa);
		this.timeVisitante.setSaldoGols(golsVisitante);		
	}
	
}
