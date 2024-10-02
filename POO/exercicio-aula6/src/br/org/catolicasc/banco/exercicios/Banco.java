package br.org.catolicasc.banco.exercicios;

public class Banco {
	
	private String nome;
	private int numero;
	private Conta[] contas;
	
	
	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new Conta[10];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void adiciona(Conta conta) {
		for (int i = 0; i < this.contas.length; i++) {
			if(this.contas[i] == null) {
				this.contas[i] = conta;
				break;
			}
			
		}
		if(conta == this.contas[this.contas.length-1]) {
			this.realocacao();
		}
	}
	
	public void realocacao() {
		int novoTamanho = this.contas.length * 2;
		Conta[] maior = new Conta[novoTamanho];
		for (int i = 0; i < this.contas.length; i++) {
			maior[i] = this.contas[i];
		}
		this.contas = maior;
	}
	
	public void mostraContas() {
		for (int i = 0; i < this.contas.length; i++) {
			Conta conta = this.contas[i];
			if(conta != null) {
				System.out.println("\nConta: " + (i+1));
				System.out.println("Titular: " + conta.getTitular());
				System.out.println("Saldo: " + conta.getSaldo());
			}
		}
	}

	public boolean contem(Conta conta) {
		for (Conta cnt: contas) {
			if(cnt.getNumero() == conta.getNumero()) {
				return true;
			}
		}
		return false;
	}
}
