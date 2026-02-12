package ss;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite:");
		int opcao = entrada.nextInt();
		switch(opcao) {
		case 10:
			System.out.println("dez");
			break;
		case 20:
			System.out.println("vinte");
			break;
		case 30:
			System.out.println("trinta");
			break;
		default:
			System.out.println("padrao");
		}
		
	}

}
