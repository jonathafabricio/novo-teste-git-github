package javaOrientadaObjetos;

import java.util.Locale;
import java.util.Scanner;

public class exercicioSecao4Aula23saidaDeDados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, x = 0, soma = 0;
		
		System.out.print("Digite um numero: ");
		n = sc.nextInt();		
		
		for (i = 0; i < n; i++) {			
			System.out.print("Digite outro numero: ");
			x = sc.nextInt();	
			soma = soma + x;
		}
		
		System.out.print("SOMA = " + soma);
		
		sc.close();		
		
	}
}
