package br.com.dio.praticando.desafio;

public class Crianca extends Pessoa{
	
	
	public String escola;
	
	public Crianca() {
		
	}
	
	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	@Override
	public String toString() {
		return "Crianca "
				+ ", escola = " + escola 
				+ ", nome = " + getNome() 
				+ ", sobreNome = " + getSobreNome() 
				+ ", idade = " + getIdade() 
				+ ", altura = " + getAltura() 
				+ "]";
	}
	
}
