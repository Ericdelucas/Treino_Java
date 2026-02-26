package aula;

import java.util.Scanner;

public class exp6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int i = 0;
		int soma = 0;
		int qtdpares=0;
		
		while(i<5) {
			System.out.println("Digite:");
			int num = entrada.nextInt();
			soma += num;
			if(num%2==0) {
				qtdpares++;
			}
			i++;
		
		}
		System.out.println("Soma: "+soma);
		System.out.println("Quantidades de pares:"+qtdpares);
	}

}
