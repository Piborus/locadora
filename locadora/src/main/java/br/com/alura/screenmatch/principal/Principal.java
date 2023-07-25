package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Filme meuFilme = new Filme("O poderoso chefão", 1972);
		// meuFilme.setNome("O poderoso chefão");
		// euFilme.setAnoLancamento(1972);
		meuFilme.setDuracaoEmMinutos(175);
		meuFilme.exibeFichaTecnica();
		System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

		meuFilme.avalia(10);
		meuFilme.avalia(5);
		meuFilme.avalia(8);
		meuFilme.avalia(4);
		System.out.println("Total de avaliação: " + meuFilme.getTotalDeAvaliacoes());
		System.out.println("Média de avaliações do filme:  " + meuFilme.pegaMedia());

		Serie minhaSerie = new Serie("Lost", 2004);
		System.out.println();
		// minhaSerie.setNome("Lost");
		// minhaSerie.setAnoLancamento(2004);
		minhaSerie.setTemporada(6);
		minhaSerie.setEpisodiosPorTmeporada(17);
		minhaSerie.setMinutosPorEpisodio(48);
		minhaSerie.exibeFichaTecnica();
		System.out.println("Duração para maratonar: " + minhaSerie.getDuracaoEmMinutos() + " minutos");

		Filme outroFilme = new Filme("Avatar 2: O caminho da agua", 2023);
		// outroFilme.setNome("Avatar 2: O caminho da agua");
		// outroFilme.setAnoLancamento(2023);
		outroFilme.setDuracaoEmMinutos(192);

		System.out.println();
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.incluir(meuFilme);
		calculadora.incluir(outroFilme);
		calculadora.incluir(minhaSerie);
		System.out.println(calculadora.getTempoTotal());

		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtra(meuFilme);

		Episodio episodio = new Episodio();
		System.out.println();
		episodio.setNumero(1);
		episodio.setNome("Lost");
		episodio.setTotalVisualizacoes(300);
		filtro.filtra(episodio);

		var filmeDoPaulo = new Filme("Dogville", 2003);
		// filmeDoPaulo.setNome("Dogville");
		filmeDoPaulo.setDuracaoEmMinutos(200);
		filmeDoPaulo.setAnoLancamento(2003);
		filmeDoPaulo.avalia(10);

		ArrayList<Filme> listaDeFilmes = new ArrayList<>();
		listaDeFilmes.add(filmeDoPaulo);
		listaDeFilmes.add(meuFilme);
		listaDeFilmes.add(outroFilme);
		System.out.println("Tamanho da lista: " + listaDeFilmes.size());
		System.out.println("Primeiro filme: " + listaDeFilmes.get(2).getNome());
		System.out.println(listaDeFilmes);
		System.out.println("toString do filme " + listaDeFilmes.get(0).toString());

	}
}
