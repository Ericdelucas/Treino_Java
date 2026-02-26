package aula;

import java.util.Scanner;

public class exp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a base: ");
		double base = entrada.nextDouble();
		System.out.println("Digite a altura: ");
		double altura = entrada.nextDouble();
		double area = (base*altura)/2;
		System.out.println("Area do trianguçp: "+area);
	}

}
