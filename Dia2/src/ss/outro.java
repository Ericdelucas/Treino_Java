package ss;

import java.util.Scanner;

public class outro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("oi");
		
		
		// vamos ter que usar uma biblioteca para a entrada de dados 
		Scanner entrada = new Scanner(System.in);
		// entrada de numero inteiro
		
		System.out.println("Digite o numero inteiro :");
		double num1 = entrada.nextInt();
		System.out.println("numero inteiro:" + num1);
		
		System.out.println("Digite o numero Double :");
		double num2 = entrada.nextDouble();
		System.out.println("numero Double:" + num2);
		
		System.out.println("Digite o numero Float :");
		Float num3 = entrada.nextFloat();
		System.out.println("numero Flutuante:" + num3);
		
		System.out.println("Fale o nome :");
		String nome = entrada.next();
		System.out.println("numero Nome:" + nome);
		
		
	}

}
