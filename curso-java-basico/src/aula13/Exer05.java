package aula13;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de metros");
		double metros = scan.nextDouble();		
		
		//1m = 100
		double cm = metros * 100;
		
		System.out.println(metros + " m ? igual a " + cm + "cm");
		
		scan.close();

	}

}
