package aula;

import java.util.Scanner;

public class atv6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero:");
		double num1 = entrada.nextDouble();
		System.out.println("Digito outro numero:");
		double num2 = entrada.nextDouble();
		double media = (num1+num2)/2;
		System.out.println("Media dos dois é: "+media);
		//test2
		System.out.println("Digite um numero:");
		double num3 = entrada.nextDouble();
		System.out.println("Digito outro numero:");
		double num4 = entrada.nextDouble();
		double maior,menor;
		if (num3>num4) {
			maior = num3;
			menor = num4;
		}else {
			maior = num4;
			menor = num3;
		}
		double result = maior/menor;
		System.out.println("Resultado: "+result);
	}

}
