package exercicios01_01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma = x + y;

		System.out.printf("Soma = %d", soma);

		sc.close();
	}

}