package aula17;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num;
		int maior = Integer.MIN_VALUE;
		
		for (int i= 0; i<= 5; i++) {
			System.out.print("Entre com um n?mero:");
			num = scan.nextInt();
			
			if (num > maior) {
				maior = num;
				System.out.println("o n?mero maior mudou: " + maior);
			}
		}
		
		System.out.println("O maior n?mero digitado foi: " + maior);
		
		scan.close();
}}


