package aula;

public class exp10 {
	public static void main(String[] args) {
		for (int i= 0; i<10;i++ ) {
			System.out.println("Tabuada: "+i);
			for(int n = 1; n<10; n++) {
				int saida = i * n;
				System.out.println("N: "+ i + "x" + n + "="+saida);
			}
		}
		
	}
	
}
