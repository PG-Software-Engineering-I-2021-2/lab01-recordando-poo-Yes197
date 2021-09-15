package cs.ing.software.lab1;


public class Main {

    public static void main(String[] args) {
        Automovil auto = new Automovil(100,10, 0.9);
        auto.totalAbastecer(90);
        auto.totalAbastecer(100);
        auto.viajar(4);

        Camion camion = new Camion(100,10, 0.9);
        camion.totalAbastecer(90);
        camion.totalAbastecer(100);
        camion.viajar(12);

    }
}