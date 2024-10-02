package aplication;

import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		boolean comNome = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("departamento: ");
		String departamento = sc.nextLine();
		System.out.print("data de entrada: ");
		String dataEntrada = sc.nextLine();
		System.out.print("rg: ");
		String 
		rg = sc.nextLine();
		System.out.print("salario: ");
		double salario = sc.nextDouble();
		System.out.print("esta na empresa?: ");
		boolean estaNaEmpresa = false;
		char opcao = sc.next().charAt(0);
		switch(opcao) {
			case 'y':
				estaNaEmpresa = true;
				break;
			case 'n':
				estaNaEmpresa = false;
				break;
			default:
				System.out.println("Opcao invalida!");
				break;
		}
		
		System.out.print("colocar nome? : ");
		opcao = sc.next().charAt(0);
		
		switch(opcao) {
		case 'y':
			comNome = true;
			break;
		case 'n':
			comNome= false;
			break;
		default:
			System.out.println("Opcao invalida!");
			break;
	}

		
		Funcionario funcionario;
		
		if (comNome == true) {
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			funcionario = new Funcionario(nome, departamento, rg, estaNaEmpresa, salario, dataEntrada);
		}else {
			funcionario = new Funcionario(departamento, rg, estaNaEmpresa, salario, dataEntrada);
		}
		
		sc.close();
		System.out.printf("\n\nNome: %s\n",funcionario.nome);
		System.out.println("Departamento: " + funcionario.departamento);
		System.out.println("Rg:" + funcionario.rg);
		System.out.println("Esta na empresa?: " + funcionario.estaNaEmpresa);
		System.out.println("Salario: " + funcionario.getSalario());
		System.out.println("Data de entrada: " + funcionario.getDataEntrada());
	}

}
