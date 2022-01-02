package aula15;

import java.util.Scanner;

public class Exer21 {

	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a quantidade e litros vendidos");
		double litros = scan.nextDouble();

		System.out.println("Entre com o tipo de combustível");
		String tipo = scan.next();
		
		double precoGasolina = 2.5;
		double precoAlcool = 1.90;
		int percDesconto = 0;
		double total = 0;
		double totalDesconto = 0;
		
		
		if (tipo.equalsIgnoreCase("a")) {
			
			if (litros <= 20) {
				percDesconto = 3;
			} else {
				percDesconto = 5;
			}
			
			total = litros * precoAlcool;
			
		} else if (tipo.equalsIgnoreCase("g")) {
			
			if (litros <= 20) {
				percDesconto = 4;
			} else {
				percDesconto = 6;
			}
			
			total = litros * precoGasolina;
		}
		
		totalDesconto = ( total / 100) * percDesconto;
		
		double precoAPagar = total - totalDesconto;
		
		System.out.println("Valor a ser pago: " + precoAPagar);
		
		scan.close();
}}
