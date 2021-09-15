package cs.ing.software.lab1;


public class Vehiculo {
    protected double capacidadCombustible;
    protected double cantidadCombustible;
    protected double consumoPorKilometro;

    public Vehiculo(double capacidadCombustible, double cantidadCombustible, double consumoPorKilometro) {
        this.capacidadCombustible = capacidadCombustible;
        this.cantidadCombustible = cantidadCombustible;
        this.consumoPorKilometro = consumoPorKilometro;
    }


    public String abastecer(double combustible, double porcentajeCapacidad) {
        String nomClase = this.getClass().getSimpleName();
        if (combustible + this.cantidadCombustible <= this.capacidadCombustible) {
            this.cantidadCombustible += (combustible * porcentajeCapacidad);
            return "La cantidad de combustible del " + nomClase + " es: " + String.format("%.2f", this.cantidadCombustible);
        } else {
            return nomClase + " no se puede reabastecer el tanque, está lleno";
        }
    }


    public String viajar(int distancia) {
        double combustibleRequerido = this.consumoPorKilometro * distancia;
        String nomClase = this.getClass().getSimpleName();
        if (combustibleRequerido > this.cantidadCombustible) {
            return nomClase + " necesita reabastecimiento de combustible";
        } else if (combustibleRequerido == this.cantidadCombustible) {
            this.cantidadCombustible -= combustibleRequerido;
            return nomClase + " viajó " + String.format(" %.1f", (double)distancia) + " km y ya no tiene combustible";
        } else {
            this.cantidadCombustible -= combustibleRequerido;
            return nomClase + " viajó " + String.format(" %.1f", (double)distancia) + " km y aún tiene " + String.format("%.2f",
                    this.cantidadCombustible) + " de combustible";
        }
    }
}
