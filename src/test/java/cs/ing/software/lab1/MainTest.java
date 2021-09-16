package cs.ing.software.lab1;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MainTest {

    @Test

    public void Test01() {
        Vehiculo nissan = new Vehiculo(50, 10, 5);
        Assert.assertEquals(nissan.viajar(90), "Vehiculo necesita reabastecimiento de combustible");
    }


    @Test
    public void Test02() {
        Automovil suzuki  = new Automovil(150, 120, 15);
        Assert.assertEquals(suzuki.abastecer(50, 0.95), "Automovil no se puede reabastecer el tanque, esta lleno");
    }


    @Test
    public void Test03() {
        Vehiculo toyota = new Automovil(150, 150, 6);
        Assert.assertEquals(toyota.viajar(25), "Automovil viajo  25.0 km y ya no tiene combustible");
    }


    @Test
    public void Test04() {
        Automovil kya = new Automovil(150, 110, 6);
        Assert.assertEquals(kya.totalAbastecer(50), "Automovil no se puede reabastecer el tanque, esta lleno");
    }


    @Test
    public void Test05() {
        Vehiculo camioncito1 = new Camion(250, 200, 10);
        Assert.assertEquals(camioncito1.viajar(17), "Camion viajo  17.0 km y aun tiene 30.00 de combustible");
    }


    @Test
    public void Test06() {
        Camion camioncito2 = new Camion(240, 10, 8);
        Assert.assertEquals(camioncito2.totalAbastecer(80), "La cantidad de combustible del Camion es: 86.00");
    }


    @Test
    public void Test07() {
        Vehiculo ford  = new Vehiculo(150, 110, 15);
        Assert.assertEquals(ford.viajar(6), "Vehiculo viajo  6.0 km y aun tiene 20.00 de combustible");
    }


    @Test
    public void Test08() {
        Vehiculo hyundai  = new Vehiculo(220, 55, 5);
        Assert.assertEquals(hyundai.viajar(11), "Vehiculo viajo  11.0 km y ya no tiene combustible");
    }


    @Test
    public void Test09() {
        Camion suzuki  = new Camion(150, 120, 15);
        Assert.assertEquals(suzuki.abastecer(30, 1), "La cantidad de combustible del Camion es: 150.00");
    }


    @Test
    public void Test10() {
        Camion camion1 = new Camion(120,88, 2);
        Assert.assertEquals(camion1.totalAbastecer(48), "Camion no se puede reabastecer el tanque, esta lleno");
    }


    @Test
    public void Test12() {
        Camion camioncito3 = new Camion(105,100, 4);
        Assert.assertEquals(camioncito3.viajar(25), "Camion viajo  25.0 km y ya no tiene combustible");
    }


    @Test
    public void testMain1() {
        Assert.assertEquals(Main.testCamion(), "Camion viajo  12.0 km y aun tiene 84.70 de combustible");
    }



    @Test
    public void testMain2() {
        Assert.assertEquals(Main.testAutomovil(), "Automovil viajo  4.0 km y aun tiene 96.40 de combustible");
    }



    @Test(invocationCount = 80, threadPoolSize = 80)
    public void Test13(){
        Vehiculo hylux = new Camion(170, 30, 2);
        Assert.assertEquals(hylux.viajar(15),"Camion viajo  15.0 km y ya no tiene combustible");
    }


}
