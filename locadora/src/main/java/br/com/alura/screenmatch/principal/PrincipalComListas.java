package br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.LinkedList;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComListas {

	public static void main(String[] args) {
		Filme meuFilme = new Filme("O poderoso chefão", 1972);
		meuFilme.avalia(9);
		Filme outroFilme = new Filme("Avatar 2: O caminho da agua", 2023);
		outroFilme.avalia(8);
		var filmeDoPaulo = new Filme("Dogville", 2003);
		filmeDoPaulo.avalia(4);
		Serie minhaSerie = new Serie("Lost", 2004);
		minhaSerie.avalia(5);

		// variavel de referência
		Filme f1 = filmeDoPaulo;
		System.out.println("olha " + f1.getNome());

		List<Titulo> lista = new LinkedList<>();
		lista.add(filmeDoPaulo);
		lista.add(meuFilme);
		lista.add(outroFilme);
		lista.add(minhaSerie);
		System.out.println();
		// exemplo 1 de forEach diferenciado.
		lista.forEach(Titulo -> System.out.println(lista));
		System.out.println();
		// exemplo 2 de forEach diferenciado
		lista.forEach(System.out::println);

		// forEach padrão
		System.out.println();
		for (Titulo item : lista) {
			System.out.println(item.getNome());
			if (item instanceof Filme filme && filme.getClassificacao() > 2) {
				System.out.println("Classificação: " + filme.getClassificacao());
			}

			/*
			 * Filme filme1 = new Filme("Avatar", 2009); Filme filme2 = new Filme("Avatar",
			 * 2009); Filme filme3 = filme1; filme3.setAnoLancamento(2005);
			 * 
			 * if (filme1 == filme2) { System.out.println("Iguais"); } else {
			 * System.out.println("Diferentes"); }
			 */

			

		}
		System.out.println();
		ArrayList<String> buscaPorArtista = new ArrayList<>();
		buscaPorArtista.add("Adam Sandler");
		buscaPorArtista.add("Paulo");
		buscaPorArtista.add("Jaqueline");
		System.out.println(buscaPorArtista);
		Collections.sort(buscaPorArtista);
		System.out.println("Depois da ordenação");
		System.out.println(buscaPorArtista);

		System.out.println("Lista de titulos ordenados");
		Collections.sort(lista);
		System.out.println(lista);
		lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
		System.out.println("Ordenado por ano");
		System.out.println(lista);
		

	}

}
