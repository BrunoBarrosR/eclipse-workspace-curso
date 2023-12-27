package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height:");
		
		Rectangle rectangle = new Rectangle();
		rectangle.height = sc.nextDouble();
		rectangle.width = sc.nextDouble();
		
		
		System.out.printf("Área do retângulo: %.2f", rectangle.area());
		System.out.println();
		System.out.printf("Perímetro: %.2f", rectangle.perimeter());
		System.out.println();
		System.out.printf("Diagonal: %.2f", rectangle.diagonal());
		
		sc.close();
	}
	
}
