package br.com.dio.praticando.desafio;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Crianca();
		
		pessoa1.setNome("Letícia");
        pessoa1.setSobreNome("da Silva");
        pessoa1.setIdade(6);
        pessoa1.setAltura(0.70d);
        pessoa1.setCpf(12345678999l);
        ((Crianca) pessoa1).setEscola("Djanira");
		
		System.out.println(pessoa1);
		
		Pessoa pessoa2 = new Adulto();
		
		pessoa2.setNome("Denílson");
		pessoa2.setSobreNome("Mirandaaa");
		pessoa2.setIdade(45);
		pessoa2.setAltura(1.65d);
		pessoa2.setCpf(123456888999l);
		((Adulto) pessoa2).setEmprego("Desenvolvedor");
		
		System.out.println(pessoa2);
		
		
		
		
	}

}
