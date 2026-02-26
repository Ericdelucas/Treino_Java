package aula;

import java.util.Scanner;

public class exp4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite");
		int opcao = entrada.nextInt();
		switch(opcao) {
		case 10:
			System.out.println("dez");
			break;
		case 20:
			System.out.println("vinte");
			break;
		default:
			System.out.println("padrão");
			
		}
	}
}
