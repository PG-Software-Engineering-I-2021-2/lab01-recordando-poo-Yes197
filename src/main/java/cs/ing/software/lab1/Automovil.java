package cs.ing.software.lab1;


public class Automovil extends Vehiculo{
    public Automovil(double capacidadCombustible, double cantidadCombustible, double consumoPorKilometro) {
      super(capacidadCombustible, cantidadCombustible, consumoPorKilometro);
    }

    public String totalAbastecer(double combustible) {
        return super.abastecer(combustible, 1);
    }



}
