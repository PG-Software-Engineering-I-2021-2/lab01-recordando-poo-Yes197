import org.testng.Assert;

public class Test01 {
    @Test01()

    public void Test01() {
        Vehiculo nissan = new Vehiculo(50, 10, 5);
        //logger.info(nissan.abastecer(20));
        Assert.assertEquals("Automóvil no se puede reabastecer el tanque, está lleno.", nissan.abastecer(90));
    }

}
