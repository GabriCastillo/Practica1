import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

/*
    Los números de Fibonacci quedan definidos por las ecuaciones

            Fibonacci {0} -> 0
            Fibonacci {1} -> 1
            Fibonacci {2} -> 1
            Fibonacci {3} -> 2
            Fibonacci {4} -> 3
            Fibonacci {n} -> Fibonacci {n-1} + Fibonacci {n-2}
 */

class FibonacciTest {

    @Test
    public void testComputeReturnsZeroIfTheNumberIsZero() {
        Fibonacci fibonacci = new Fibonacci();

        int expectedValue = 0;
        int obtainValue = fibonacci.compute(0);

        assertEquals(expectedValue, obtainValue);
    }

    @Test
    public void testComputeReturnsOneIfTheNumberIsOne(){
        Fibonacci fibonacci = new Fibonacci();

        int expectedValue = 1;
        int obtainValue = fibonacci.compute(1);

        assertEquals(expectedValue, obtainValue);
    }

    @Test
    public void testComputeReturnsOneIfTheNumberIsTwo(){
        Fibonacci fibonacci = new Fibonacci();

        int expectedValue = 1;
        int obtainValue = fibonacci.compute(2);

        assertEquals(expectedValue, obtainValue);
    }

    @Test
    public void testComputeReturnsTwoIfTheNumberIsThree(){
        Fibonacci fibonacci = new Fibonacci();

        int expectedValue = 2;
        int obtainValue = fibonacci.compute(3);

        assertEquals(expectedValue, obtainValue);
    }

    @Test
    public void testComputeReturnsThreeIfTheNumberIsFour(){
        Fibonacci fibonacci = new Fibonacci();

        int expectedValue = 3;
        int obtainValue = fibonacci.compute(4);

        assertEquals(expectedValue, obtainValue);
    }

    @Test
    public void testComputeThroesExceptionIfTheNumberIsNegative(){
        var fibonacci = new Fibonacci();
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1)) ;

    }

    @Test
    public void testComputeThroesExceptionIfTheNumberIsGratherThanFortysix(){
        var fibonacci = new Fibonacci();
        assertThrows(RuntimeException.class, () -> fibonacci.compute(47)) ;
    }
}