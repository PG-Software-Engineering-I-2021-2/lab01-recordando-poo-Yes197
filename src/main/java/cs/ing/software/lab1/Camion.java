package cs.ing.software.lab1;


public class Camion extends Vehiculo {
    public Camion(double capacidadCombustible, double cantidadCombustible, double consumoPorKilometro) {
        super(capacidadCombustible, cantidadCombustible, consumoPorKilometro);
    }


    public String totalAbastecer(double combustible) {
        return super.abastecer(combustible, 0.95);
    }

}
