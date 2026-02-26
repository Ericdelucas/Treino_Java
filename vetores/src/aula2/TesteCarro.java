package aula2;

public class TesteCarro {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Carro c1 = new Carro();
        c1.marca = "Fiat";
        System.out.println("Modelo:"+c1.marca);
        System.out.println(c1.modelo);

        Carro c2 = new Carro("Peugeout");
        System.out.println(c2.marca);
        
        Carro c3 = new Carro("Gol","Volkswagen");
        System.out.println("");
    }
}