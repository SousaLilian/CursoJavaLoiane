package aula16;

import java.util.Scanner;

public class LoopWhile {

	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i = 1; // count ou cont
		int max = 10;
		
		System.out.println("Contando at� " + max);
		
		while (i <= max) {
			System.out.println("Valor de i: " + i);
			i++; // i = i + 1; ou i +=1;
		}
		
		System.out.println("O valor de i: " + i); // valor � 11
		
		do {
			i++;
			System.out.println("Valor de i: " + i);
			
		} while (i <15);
		
		System.out.println(i);
		
		scan.close();
}}