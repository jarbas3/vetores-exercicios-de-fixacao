package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		String[] vectNames = new String[n];
		double[] vectScoreA = new double[n];
		double[] vectScoreB = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
			sc.nextLine();
			vectNames[i] = sc.nextLine();
			vectScoreA[i] = sc.nextDouble();
			vectScoreB[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < n; i++) {
			double finalScore = (vectScoreA[i] + vectScoreB[i]) / 2.0;
			if (finalScore >= 6.0) {
				System.out.println(vectNames[i]);
			}
		}
		
		sc.close();
	}
}
