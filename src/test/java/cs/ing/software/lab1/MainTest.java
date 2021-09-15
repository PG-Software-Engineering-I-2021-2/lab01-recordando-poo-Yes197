package cs.ing.software.lab1;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MainTest {
    @Test

    public void Test01() {
        Vehiculo nissan = new Vehiculo(50, 10, 5);
        Assert.assertEquals(nissan.viajar(90), "Vehiculo necesita reabastecimiento de combustible");
    }


    public void Test07() {
        Vehiculo ford  = new Vehiculo(150, 110, 15);
        Assert.assertEquals(ford.viajar(6), "Vehiculo 6.0 km y aún tiene 90.00 de combustible");
    }


    public void Test08() {
        Vehiculo hyundai  = new Vehiculo(220, 55, 5);
        Assert.assertEquals(hyundai.viajar(11), "Vehiculo viajó  11.0 km ya no tiene combustible");
    }


    public void Test02() {
        Automovil suzuki  = new Automovil(150, 120, 15);
        Assert.assertEquals(suzuki.abastecer(50, 0.95), "Vehiculo no se puede reabastecer el tanque, está lleno");
    }


    public void Test09() {
        Camion suzuki  = new Camion(150, 120, 15);
        Assert.assertEquals(suzuki.abastecer(30, 1), "La cantidad de combustible del Vehiculo es: 148.50");
    }


    public void Test03() {
        Vehiculo toyota = new Automovil(150, 150, 6);
        Assert.assertEquals(toyota.viajar(25), "Automovil viajó  150.0 km y ya no tiene combustible");
    }

    public void Test04() {
        Automovil kya = new Automovil(150, 110, 6);
        Assert.assertEquals(kya.totalAbastecer(50), "Automovil no se puede reabastecer el tanque, está lleno");
    }


    public void Test05() {
        Vehiculo camioncito1 = new Camion(250, 200, 10);
        Assert.assertEquals(camioncito1.viajar(17), "Camion viajó  17.0 km y aún tiene 30.00 de combustible");
    }


    public void Test06() {
        Camion camioncito2 = new Camion(240, 10, 8);
        Assert.assertEquals(camioncito2.totalAbastecer(80), "La cantidad de combustible del Camion es: 86.00");
    }


    public void Test10() {
        Camion camion1 = new Camion(120,18, 2);
        Assert.assertEquals(camion1.totalAbastecer(48), "La cantidad de combustible del Camion es: 63.60");
    }


    public void Test11() {
        Camion camion1 = new Camion(120,18, 2);
        Assert.assertEquals(camion1.cantidadCombustible, "18.0");
    }

}
