import aritmetica.Aritmetica;
import org.junit.Test;

import static org.junit.Assert.*;

public class AritmeticaTest {
    @Test
    public void testSuma() {
        //fail("Not yet implemented");
        Aritmetica aritmetica = new Aritmetica();
        assertEquals(2, aritmetica.suma(1,1), 0);
    }
    @Test
    public void testResta() {
        //fail("Not yet implemented");
    }
    @Test
    public void testMultiplicacion() {
        //fail("Not yet implemented");
    }
    @Test
    public void testDivision() {
        //fail("Not yet implemented");
    }
    @Test(expected = ArithmeticException.class)
    public void divisionPorCero(){
       // try {
            System.out.println(1 / 0);
         //   fail("Aqui no debe llegar");
        //} catch (ArithmeticException e){

        //}

    }
}
