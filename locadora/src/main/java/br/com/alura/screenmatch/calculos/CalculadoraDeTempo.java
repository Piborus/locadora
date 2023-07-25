package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;


public class CalculadoraDeTempo {

	private int tempoTotal;

	public int getTempoTotal() {
		return this.tempoTotal;
	}

	/*public void incluir(Filme f) {
		this.tempoTotal += f.getDuracaoEmMinutos();
	}
	
	public void incluir(Serie s) {
		this.tempoTotal += s.getDuracaoEmMinutos();
	}*/
	public void incluir(Titulo titulo) {
		System.out.println("Adicionando duração em minutos de " + titulo);
		this.tempoTotal += titulo.getDuracaoEmMinutos();
	}
}
