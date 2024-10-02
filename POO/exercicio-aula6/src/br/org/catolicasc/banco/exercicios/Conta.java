package br.org.catolicasc.banco.exercicios;

public class Conta {
	
	private static int totalDeContas;
	private int numero;
	private double saldo;
	private double limite = 0; 
	private String titular; 

	public Conta(String titular){
		this();
		this.titular = titular;
	}
	
	public Conta(int numero, String titular){
		this(titular);
		this.titular = titular;
	}
	
	public Conta(){
		Conta.totalDeContas = Conta.totalDeContas + 1; 
	}
	
	public boolean saca(double quantidade) {
		if (validaSaldo(quantidade)) {
			return false;
		} else {
			saldo -= quantidade;
			return true;
		}
	}

	private boolean validaSaldo(double quantidade) {
		return (saldo + limite) < quantidade;
	}

	public void deposita(double quantidade) {
		if(quantidade > 0) {
			saldo += quantidade;
		}
	}
	
	public boolean transfere(Conta destino, double quantidade) {
		boolean sacou = this.saca(quantidade);
		if(sacou) {
			destino.deposita(quantidade);
			return true;
		} else {
			return false;
		}
		
	}

	public double getSaldo() {
		return saldo + limite;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public static int getTotalDeContas() {
		return totalDeContas;
	}

}
