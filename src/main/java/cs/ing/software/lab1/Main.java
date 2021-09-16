package cs.ing.software.lab1;


public class Main {

    public static String testAutomovil() {
        Automovil auto = new Automovil(100, 10, 0.9);
        auto.totalAbastecer(90);
        auto.totalAbastecer(100);
        return auto.viajar(4);

    }

    public static String testCamion() {
        Camion camion = new Camion(100,10, 0.9);
        camion.totalAbastecer(90);
        camion.totalAbastecer(100);
        return camion.viajar(12);
    }


    public static void main(String[] args) {
        Main.testAutomovil();
        Main.testCamion();
    }

}