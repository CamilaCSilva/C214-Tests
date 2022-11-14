package br.inatel.cdg.serie.impl;

import br.inatel.cdg.serie.interfaces.iObservador;

public class Observador implements iObservador {

	int id;

	public Observador(int id) {
		this.id = id;
	}

	@Override
	public void update(Observavel countPalavras) {
		System.out.println("Cliente: "+this.id);
		System.out.println("Frase: " + countPalavras.getFrase());
		System.out.println("Número de palavras: " + countPalavras.getNumeroPalavras());
		System.out.println("Número de palavras com número de caracteres par: " + countPalavras.getNumeroPalavrasPares());
		System.out.println("Número de palavras que começam com letra maiúscula: " + countPalavras.getNumeroPalavrasMaiusculas() + "\n");
	}

}