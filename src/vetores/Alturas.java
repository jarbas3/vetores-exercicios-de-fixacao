package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String[] vectNames = new String[n];
		int[] vectAges = new int[n];
		double[] vectHeights = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			vectNames[i] = sc.nextLine();
			System.out.print("Idade: ");
			vectAges[i] = sc.nextInt();
			System.out.print("Altura: ");
			vectHeights[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		double sumHeights = 0.0;
		for (int i = 0; i < n; i++) {
			sumHeights += vectHeights[i];
		}
		double average = sumHeights / vectHeights.length;
		System.out.printf("Altura média: %.2f%n", average);
		
		int under16 = 0;
		for (int i = 0; i < vectAges.length; i++) {
			if (vectAges[i] < 16) {
				under16++;
			}
		}
		double percentage = (double) under16 / vectAges.length * 100.0;
			System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentage);
		
		for (int i = 0; i < vectAges.length; i++) {
			if (vectAges[i] < 16) {
				System.out.println(vectNames[i]);
			}
		}
		
		sc.close();
	}
}
