package Entorno;

import java.util.Scanner;

public class Entorno1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.println("Introduzca numero: ");
		num = teclado.nextInt();
		System.out.println((num % 2) == 0 ? "PAR" : "IMPAR");

	}
}
