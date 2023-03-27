package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//	Curso	
		Curso curso1 = new Curso();
		
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso java");
		curso2.setDescricao("descrição curso java");
		curso2.setCargaHoraria(9);
		
		

//		Mentoria
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		BootCamp bootCamp = new BootCamp();
		
		bootCamp.setNome("Bootcamp Java developer ");
		bootCamp.setDescricao("Descricao Bootcamo Java Deveoper ");
		bootCamp.getConteudos().add(curso1);
		bootCamp.getConteudos().add(curso2);
		bootCamp.getConteudos().add(mentoria);
		
		Dev devDouglas = new Dev();
		devDouglas.setNome("Douglas");
		devDouglas.inscreverBootcamp(bootCamp);
		System.out.println("Conteudos Incritos Douglas " + devDouglas.getConteudoInscritos());
		devDouglas.progredir();
		System.out.println("-");
		System.out.println("Conteudos Incritos Douglas " + devDouglas.getConteudoInscritos());
		System.out.println("Conteudos concluídos Douglas " + devDouglas.getConteudosConcluidos());
		System.out.println("XP: " + devDouglas.calcularTotalXP());
		
		System.out.println("-------");
		
		Dev devMarcelly = new Dev();
		devMarcelly.setNome("Marcelly");
		devMarcelly.inscreverBootcamp(bootCamp);
		System.out.println("Conteudos Incritos MArcelly " + devMarcelly.getConteudoInscritos());
		devMarcelly.progredir();
		System.out.println("-");
		System.out.println("Conteudos Incritos MArcelly " + devMarcelly.getConteudoInscritos());
		System.out.println("XP: " + devMarcelly.calcularTotalXP());
		System.out.println("Conteudos concluídos MArcelly " + devMarcelly.getConteudosConcluidos());
		
		

		
		
	}

}
