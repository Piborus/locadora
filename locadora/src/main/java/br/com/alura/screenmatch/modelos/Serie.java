package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {

	private int temporada;
	private boolean ativa;
	private int episodiosPorTmeporada;
	private int minutosPorEpisodio;
	
	public Serie(String nome, int anoLancamento) {
		super(nome, anoLancamento);
	}

	public int getTemporada() {
		return temporada;
	}

	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}

	public boolean getAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public int getEpisodiosPorTmeporada() {
		return episodiosPorTmeporada;
	}

	public void setEpisodiosPorTmeporada(int episodiosPorTmeporada) {
		this.episodiosPorTmeporada = episodiosPorTmeporada;
	}

	public int getMinutosPorEpisodio() {
		return minutosPorEpisodio;
	}

	public void setMinutosPorEpisodio(int minutosPorEpisodio) {
		this.minutosPorEpisodio = minutosPorEpisodio;
	}
	
	@Override
	public int getDuracaoEmMinutos() {
		return temporada * episodiosPorTmeporada * minutosPorEpisodio;
	}
	
	@Override
	public String toString() {
		return "Serie: " + this.getNome() + "(" + this.getAnoLancamento() + ")";
	} 
	

}
