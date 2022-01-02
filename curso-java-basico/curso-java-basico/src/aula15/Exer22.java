package aula15;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a quantidade (kg) de morango:");
		double qtdMorango = scan.nextDouble();
		
		System.out.println("Entre com a quantidade (kg) de ma�a:");
		double qtdMaca = scan.nextDouble();
		
		double precoKgMorango = 0;
		if (qtdMorango <=5) {
			precoKgMorango = 2.5;
		} else {
			precoKgMorango = 2.2;
		}
		
		double precoKgMaca = 0;
		if (qtdMaca <= 5) {
			precoKgMaca = 1.8;
		} else {
			precoKgMaca = 1.5;
		}
		
		double precoTotalMorango = qtdMorango * precoKgMorango;
		System.out.println("Pre�o total do morango " + precoTotalMorango);
		
		double precoTotalMaca = qtdMaca * precoKgMaca;
		System.out.println("Pre�o total do ma�a " + precoTotalMaca);
		
		double precoParcial = precoKgMorango + precoKgMaca;
		double precoTotal = precoParcial;
		
		if ((qtdMorango + qtdMaca > 8) || precoParcial > 25) {
			precoTotal = precoParcial - ((precoParcial / 100) * 10);
		}
		
		System.out.println("Pre�o total = " + precoTotal);
		
		
		scan.close();
}}
