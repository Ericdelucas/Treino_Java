package ss;

import java.util.Scanner;

public class resoluçao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// base e altura
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o numero :");
		int num = entrada.nextInt();
		
		if(num>10) {
			System.out.println("numero e maior que 10");
			
		
		}else if (num == 10){
			System.out.println("Numero e igual a 10");
		}else {
			System.out.println("Numero nao e maior que 10");
		}	
		
	}
}
