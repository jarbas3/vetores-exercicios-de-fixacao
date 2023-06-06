package vetores;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		double larger = vect[0];
		int position = 0;
		for (int i = 1; i < vect.length; i++) {
			if (vect[i] > larger) {
				larger = vect[i];
				position = i;
			}
		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR = %.1f%n", larger);
		System.out.println("POSICAO DO MAIOR VALOR = " + position);
		
		sc.close();
	}
}
