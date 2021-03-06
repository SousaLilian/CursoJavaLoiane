package aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double salario = 1000; // ano 1995

		double percentual = 1.5; // ano 1996

		salario += (salario / 100) * percentual; // ano 1996

		DecimalFormat format = new DecimalFormat("###,###.##");
		
		for (int i = 1997; i <= 2015; i++) {

			percentual *= 2;

			salario += (salario / 100) * percentual;

			System.out.println(i + " = " + format.format(salario) + " - " + percentual + "%");
		}

		scan.close();
	}
}
