package vetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		int evenSum = 0;
		int evenQuantity = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				evenSum += vect[i];
				evenQuantity++;
			}
		}
		if (evenQuantity == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			double evenAverage = (double) evenSum / evenQuantity;
			System.out.printf("MEDIA DOS PARES = %.1f%n", evenAverage);
		}
		
		sc.close();
	}
}
