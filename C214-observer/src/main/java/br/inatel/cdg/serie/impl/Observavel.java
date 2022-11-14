package br.inatel.cdg.serie.impl;

import java.util.ArrayList;
import java.util.List;

import br.inatel.cdg.serie.interfaces.iObservavel;

public class Observavel implements iObservavel {

	private String frase;
	private int numeroPalavras, numeroPalavrasPares, numeroPalavrasMaiusculas;
	private List<Observador> clientes;

	public Observavel() {
		clientes = new ArrayList<Observador>();
	}

	@Override
	public void registraObservador(Observador obs) {
		clientes.add(obs);
	}

	@Override
	public void removeObservador(Observador obs) {
		if(clientes.contains(obs))
			clientes.remove(obs);
	}

	@Override
	public void notificaObservadores() {
		for (Observador observador : clientes) {
			observador.update(this);
		}
	}

	private int contaPalavrasPares(String[] palavras) {
		int count = 0;
		for(String s: palavras) {
			if(s.length() % 2 == 0){
				count+=1;
			}
		}
		return count;
	}

	private int contaPalavrasMaiusculas(String[] palavras){
		int count = 0;
		for(int j = 0; j<palavras.length; j++){
			char aux = palavras[j].charAt(0);
			if(Character.isUpperCase(aux) == true){
				count+=1;
			}
		}
		return count;
	}
	//Esse método é chamado sempre que os valores
	//se modificacam
	private void novasMedidas(String frase) {
		String[] palavrasAux = frase.split(" ");
		int count1 = 0;
		int count2 = 0;

		setNumeroPalavras(palavrasAux.length);

		count1= contaPalavrasPares(palavrasAux);
		setNumeroPalavrasPares(count1);

		count2 = contaPalavrasMaiusculas(palavrasAux);
		setNumeroPalavrasMaiusculas(count2);

		System.out.println("--------------------- Nova noticação --------------------");
		notificaObservadores();
	}

	public void setNovaFrase(String frase) {
		System.out.println("\n\n####### Nova frase adicionada #######\n\n");
		this.frase = frase;
		novasMedidas(this.frase);
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public void setClientes(List<Observador> clientes) {
		this.clientes = clientes;
	}

	public List<Observador> getClientes() {
		return clientes;
	}

	public int getNumeroPalavrasMaiusculas() {
		return numeroPalavrasMaiusculas;
	}

	public void setNumeroPalavrasMaiusculas(int numeroPalavrasMaiusculas) {
		this.numeroPalavrasMaiusculas = numeroPalavrasMaiusculas;
	}

	public int getNumeroPalavrasPares() {
		return numeroPalavrasPares;
	}

	public void setNumeroPalavrasPares(int numeroPalavrasPares) {
		this.numeroPalavrasPares = numeroPalavrasPares;
	}

	public int getNumeroPalavras() {
		return numeroPalavras;
	}

	public void setNumeroPalavras(int numPalavras) {
		this.numeroPalavras = numPalavras;
	}

}
