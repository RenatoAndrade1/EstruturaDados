package br.ucsal.ed;

import java.util.Scanner;

public class Questao_1 {
	
	public static void main(String[] args) {
		int n1,n2,n3,n4,n5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o primeiro n�mero: ");
		n1 = sc.nextInt();
		System.out.println("Insira o segundo n�mero: ");
		n2 = sc.nextInt();
		System.out.println("Insira o terceiro n�mero: ");
		n3 = sc.nextInt();
		System.out.println("Insira o quarto n�mero: ");
		n4 = sc.nextInt();
		System.out.println("Insira o quinto n�mero: ");
		n5 = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Primeiro: " + (n1*n1) + "\n"
				+ "Segundo: " +(n2*n2) + "\n"
				+ "Terceiro: " + (n3*n3) + "\n"
				+ "Quarto: " + (n4*n4) + "\n"
				+ "Quinto: " + (n5*n5));
		
	}

}
