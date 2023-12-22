package exercicios02_04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora do início do jogo:");
		int ini = sc.nextInt();

		System.out.println("Digite a hora do final do jogo:");
		int fim = sc.nextInt();

		int resultado = ini - fim;

		if (ini > fim || ini == fim) {
			fim = fim + 24;
			resultado = fim - ini;
			System.out.printf("O jogo durou %d hora(s).", resultado);
		} else {
			resultado = fim - ini;
			System.out.printf("O jogo durou %d hora(s).", resultado);
		}
		sc.close();
	}
}
