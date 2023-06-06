package vetores;

import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String[] vectNames = new String[n];
		int[] vectAges = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			vectNames[i] = sc.nextLine();
			System.out.print("Idade: ");
			vectAges[i] = sc.nextInt();
		}
		
		int olderPosition = 0;
		int older = vectAges[0];
		for (int i = 1; i < vectAges.length; i++) {
			if (vectAges[i] > older) {
				older = vectAges[i];
				olderPosition = i;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + vectNames[olderPosition]);
		
		sc.close();
	}
}
