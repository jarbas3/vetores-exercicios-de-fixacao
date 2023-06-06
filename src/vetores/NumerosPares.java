package vetores;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("NUMEROS PARES:");
		int counter = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				counter++;
				System.out.printf("%d ", vect[i]);
			}
		}
		System.out.println();
		
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + counter);
		
		sc.close();
	}
}
