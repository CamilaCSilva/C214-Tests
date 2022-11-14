package br.inatel.cdg;

import br.inatel.cdg.serie.impl.Observavel;
import br.inatel.cdg.serie.impl.Observador;

public class CountPalavras {

	public static void main(String[] args) {

		// Criando o observavel (subject) countPalavras.
		Observavel countPalavras = new Observavel();

		//Criando 3 observadores e fazendo a inscrição em countPalavras.
		Observador obs1 = new Observador(1);
		Observador obs2 = new Observador(2);
		Observador obs3 = new Observador(3);
		Observador obs4 = new Observador(4);

		countPalavras.registraObservador(obs1);
		countPalavras.registraObservador(obs2);
		countPalavras.registraObservador(obs3);
		countPalavras.registraObservador(obs4);

		countPalavras.setNovaFrase("Eu juro Solenemente que não vou fazer Nada de Bom");

		countPalavras.removeObservador(obs1);

		countPalavras.setNovaFrase("We're gonna get it, get it Together and Flower");

		countPalavras.removeObservador(obs4);

		countPalavras.setNovaFrase("Up in Flames");

	}

}
