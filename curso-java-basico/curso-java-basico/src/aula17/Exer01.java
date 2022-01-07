package aula17;

import java.util.Scanner;

public class Exer01 {

	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um nota");
		
		boolean notaValida = false;
		
	do {
					
		double nota = scan.nextDouble();
		
		if (nota >=0 && nota <=10) {
			notaValida = true;
			System.out.println("Você digitou: " + nota);
		} else {
			System.err.println("Nota inválida, digite novamente.");
		} 
		
	} while (!notaValida);
		
		
		
		scan.close();
}}
