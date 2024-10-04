package program;

import java.util.Scanner;

public class MatrizExecice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("tamanho de matriz quadrada: ");
		int n = sc.nextInt();
		sc.nextLine();
		int[][] matriz = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("numero na linha %d, coluna %d ", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}


		System.out.println("matriz:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%d ", matriz[i][j]);
			}
			System.out.println();
		}

		System.out.print("diagonal pricipal: ");
		for (int i = 0; i < n; i++) {
			
			System.out.printf("%d ", matriz[i][i]);
		}

		int negativeNum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					negativeNum++;
				}
			}
		}
		System.out.println("quantidade de numeros negativos: " + negativeNum);
		sc.close();
	}

}
