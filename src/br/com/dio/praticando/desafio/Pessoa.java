package br.com.dio.praticando.desafio;

public class Pessoa {
	
	String nome;
	String sobreNome;
	int idade;
	long cpf;
	double altura;
	
	public Pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobreNome() {
		return sobreNome;
	}
	
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public float getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Pessoa "
				+ "[ nome = " + nome 
				+ ", sobreNome = " + sobreNome 
				+ ", idade = " + idade 
				+ ", cpf = " + cpf 
				+ ", altura = "
				+ altura + "]";
	}
	
}
