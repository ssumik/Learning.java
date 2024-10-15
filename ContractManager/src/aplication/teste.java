package aplication;

import java.time.DateTimeException;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String data = "2002/09";
		try {
			YearMonth date = YearMonth.parse(data, DateTimeFormatter.ofPattern("yyyy/MM"));
			System.out.println(date);
			System.out.println(date.getYear());
			System.out.println(date.getMonthValue());
		} catch (DateTimeException ex) {
			System.out.println("Formato inválido.");
		}
		sc.close();

	}

}
