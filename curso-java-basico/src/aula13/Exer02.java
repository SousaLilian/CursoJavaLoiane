package aula13;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com n?mero inteiro:");
		int numero = scan.nextInt();
		System.out.println("O n?mero informado foi: " + numero);
		
		scan.close();
	}
}
