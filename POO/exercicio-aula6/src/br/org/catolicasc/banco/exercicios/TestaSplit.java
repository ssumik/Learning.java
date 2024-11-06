package br.org.catolicasc.banco.exercicios;

public class TestaSplit {

	public static void main(String[] args) {
		
		String frase = "Socorram-me, subi no �nibus em Marrocos";
		
		String[] split = frase.split(" ");
		
		for(int i = split.length - 1; i >= 0; i--) {
			System.out.print(split[i] + " ");
		}

	}

}
