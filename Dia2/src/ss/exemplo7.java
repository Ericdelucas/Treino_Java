package ss;

import java.util.Scanner;


public class exemplo7 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// contador => controla a qtd de laços i cont i++
		// acumulador => soma += num 
		// entrada => num 
		// qtd => if 
		
		Scanner entrada = new Scanner(System.in);
		
		int soma = 0;
		int i = 0;
		int qtdpares = 0;
		
		while(i <5) {
			System.out.println("digite.");
			int num = entrada.nextInt();
			soma +=num;
			
			if(num%2==0) {
				qtdpares++;
				
			}
			
		
			i++;	
		}
		System.out.println("Soma" + soma);
		System.out.println("quantidade de pares:" +qtdpares);
		
	}

}
