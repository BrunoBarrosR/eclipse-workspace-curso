package exercicios02_01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
					
		System.out.println("Digite um número inteiro: ");
		
		int x = sc.nextInt();
		
		if (x > 0) {
			System.out.println("Número positivo");
		} else {
			System.out.println("Número negativo");
		}
		sc.close();
	}
}
