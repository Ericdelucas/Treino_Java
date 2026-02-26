package aula;

import java.util.Scanner;

public class exp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int num = entrada.nextInt();
		if(num>10) {
			System.out.println("Numero é maior que 10");
		}else if(num==10) {
			System.out.println("Numero é 10");
		}else {
			System.out.println("Numero é menor que 10");
		}
		
	}

}
