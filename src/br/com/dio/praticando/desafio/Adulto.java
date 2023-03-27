package br.com.dio.praticando.desafio;

public class Adulto extends Pessoa{
	
	private String emprego;
	
	public Adulto() {
		
	}

	public String getEmprego() {
		return emprego;
	}

	public void setEmprego(String emprego) {
		this.emprego = emprego;
	}

	@Override
	public String toString() {
		return "Adulto "
				+ "[emprego = " + emprego 
				+ ", nome = " + getNome()
				+ ", sobreNome = " + getSobreNome()
				+ ", idade = " + getIdade()
				+ ", cpf = " + getCpf() 
				+ ", altura = " + getAltura()
				+ "]";
	}
	
	
	

}
