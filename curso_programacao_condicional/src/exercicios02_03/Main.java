package exercicios02_03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para A:");
		int A = sc.nextInt();
		
		System.out.println("Digite um valor para B:");
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("São multiplos");
		} else {
			System.out.println("Não são multiplos");
		}
		
		sc.close();
	}

}
