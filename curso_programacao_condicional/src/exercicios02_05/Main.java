package exercicios02_05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int cod, quant;
		double preco, resultado;

		System.out.println("Digite o código:");
		cod = sc.nextInt();

		System.out.println("Digite a quantidade:");
		quant = sc.nextInt();
		
		resultado = 0;

		if (cod == 1) {
			preco = 4.00;
			resultado = preco * quant;
		} else if (cod == 2) {
			preco = 4.50;
			resultado = preco * quant;

		} else if (cod == 3) {
			preco = 5.00;
			resultado = preco * quant;
		} else if (cod == 4) {
			preco = 2.00;
			resultado = preco * quant;
		} else if (cod == 5) {
			preco = 1.50;
			resultado = preco * quant;
		}
		System.out.printf("Total: R$ %.2f", resultado);
		
		sc.close();
	}

}
