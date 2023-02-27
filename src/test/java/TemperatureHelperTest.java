import junit.framework.TestCase;

public class TemperatureHelperTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testFarenheitToCelsius() {
        double result1 = TemperatureHelper.farenheitToCelsius(40);
        double result2= TemperatureHelper.farenheitToCelsius(32);
        assertEquals(4, result1 = 4.44);
        assertEquals(0, result2 = 0.11);
    }

    public void testFarenheitToKelvin() {
    }

    public void testCelsiusToFarenheit() {
    }

    public void testCelsiusToKelvin() {
    }

    public void testKelvinToFarenheit() {
    }

    public void testKelvinToCelsius() {
    }
}