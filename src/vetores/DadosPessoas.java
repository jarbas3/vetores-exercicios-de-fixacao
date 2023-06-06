package vetores;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		double[] heightsVect = new double[n];
		char[] genderVect = new char[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			heightsVect[i] = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			genderVect[i] = sc.next().charAt(0);
		}
		
		double smaller = heightsVect[0];
		double tallest = heightsVect[0];
		for (int i = 1; i < heightsVect.length; i++) {
			if (heightsVect[i] < smaller) {
				smaller = heightsVect[i];
			}
			if (heightsVect[i] > tallest) {
				tallest = heightsVect[i];
			}
		}
		
		int womanCounter = 0;
		int menCounter = 0;
		double womanHeightSum = 0.0;
		for (int i = 0; i < genderVect.length; i++) {
			if (genderVect[i] == 'F') {
				womanHeightSum += heightsVect[i];
				womanCounter++;
			}
			if (genderVect[i] == 'M') {
				menCounter++;
			}
		}
		
		System.out.printf("Menor altura = %.2f%n", smaller);
		System.out.printf("Maior altura = %.2f%n", tallest);
		
		if (womanCounter != 0) {
			double averageHeightOfWomen = womanHeightSum / womanCounter;
			System.out.printf("Media das alturas das mulheres = %.2f%n", averageHeightOfWomen);
		}
		System.out.println("Numero de homens = " + menCounter);		
		
		sc.close();
	}
}
