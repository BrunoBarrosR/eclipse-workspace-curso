package exercicios01_05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int codpec1 = sc.nextInt();
		int numpec1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		int codpec2 = sc.nextInt();
		int numpec2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		double valorTotal = (numpec1 * valor1 + numpec2 * valor2);
		
		System.out.printf("Valor a pagar: R$ %.2f", valorTotal);
		
		
		sc.close();
	}

}
