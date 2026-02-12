package ss;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);

		System.out.println("digite o numero 1:");
		System.out.println("digite o numero 2:");

		double numero1 = entrada.nextDouble();
		double numero2 = entrada.nextDouble();
		
		double media = (numero1 + numero2)/2;
		
		System.out.println(media);
		
		
		
		if(numero1 > numero2) {
			double resul = (numero1/numero2);
			System.out.println(resul);
		}else if(numero1 < numero2){
			double resul = (numero2/numero1);
			System.out.println(resul);
		}
		
	}

}
