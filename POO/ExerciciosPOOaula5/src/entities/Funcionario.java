package entities;

public class Funcionario {
	public int identificador;
	public String nome;
	public String departamento;
	public String rg;
	public boolean estaNaEmpresa;
	
	private Double salario;
	private String dataEntrada;

	// Construtores
	public Funcionario(String nome, String departamento, String rg, boolean estaNaEmpresa, Double salario,
			String dataEntrada) {
		this.nome = nome;
		this.departamento = departamento;
		this.rg = rg;
		this.estaNaEmpresa = estaNaEmpresa;
		this.salario = salario;
		this.dataEntrada = dataEntrada;
	}
	
	public Funcionario(String departamento, String rg, boolean estaNaEmpresa, Double salario, String dataEntrada) {
		this.departamento = departamento;
		this.rg = rg;
		this.estaNaEmpresa = estaNaEmpresa;
		this.salario = salario;
		this.dataEntrada = dataEntrada;
	}

	// Getters e setters
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public String getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	// Métodos
	public void bonifica(double aumento) {
		this.salario += aumento;
	}

	public void demite() {
		estaNaEmpresa = false;
	}
}