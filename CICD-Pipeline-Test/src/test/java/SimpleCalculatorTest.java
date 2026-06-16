import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {

    SimpleCalculator c=new SimpleCalculator();

    @Test
    public void testAdd(){

        assertEquals(15,c.add(10,5));

    }

    @Test
    public void testSub(){

        assertEquals(5,c.sub(10,5));

    }

    @Test
    public void testMul(){

        assertEquals(50,c.mul(10,5));

    }

    @Test
    public void testDiv(){

        assertEquals(2,c.div(10,5));

    }

    @Test
    public void testMod(){

        assertEquals(0,c.mod(10,5));

    }

    @Test
    public void testDivideByZero(){

        assertThrows(
                ArithmeticException.class,
                ()->c.div(10,0)
        );

    }

}