package br.org.catolicasc.banco.exercicios;

public class TestaBanco {

	public static void main(String[] args) {
		
		Banco banco = new Banco("Bradesco",2727);
				
		Conta conta = new Conta();
		conta.setTitular("Ana");
		conta.setNumero(2828);
		conta.deposita(500);
		
		banco.adiciona(conta);
		
		Conta conta2 = new Conta();
		conta2.setTitular("Maria");
		conta2.setNumero(2929);
		conta2.deposita(750);
				
		banco.adiciona(conta2);
		
		Conta conta3 = new Conta();
		conta3.setTitular("João");
		conta3.setNumero(2929);
		conta3.deposita(750);
		
		banco.adiciona(conta3);
		
		Conta conta4 = new Conta();
		conta4.setTitular("Lucas");
		conta4.setNumero(2929);
		conta4.deposita(750);
		
		banco.adiciona(conta4);

		banco.mostraContas();
		
		System.out.println(banco.contem(conta4));
	}

}
