package aula15;

import java.util.Scanner;

public class Exer18 {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o n�mero");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Par !!");
		} else {
			System.out.println("�mpar!!");
		}
		
		scan.close();
}}

