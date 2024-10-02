package br.org.catolicasc.banco.exercicios;

public class TestaArrays {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[10];
		double media = 0;
		double soma = 0;
		
		for (int i = 0; i < contas.length; i++) {
			Conta conta = new Conta();
			conta.deposita(i * 150);
			contas[i] = conta;
		}
		
		System.out.println("Saldos");
		for (int i = 0; i < contas.length; i++) {
			System.out.println("Conta " + (i+1) + ": R$" + contas[i].getSaldo());
			soma = soma + contas[i].getSaldo();
		}
		
		System.out.println("\nSoma dos saldos: R$" + soma);
		media = soma / contas.length;
		System.out.println("Media dos saldo: R$" + media);		

	}

}
