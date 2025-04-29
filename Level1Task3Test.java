import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Level1Task3Test {
    @Test
    public void testTotalMarks_AllA() {
        char[] input = {'a', 'a', 'a'};
        int expected = 30; //10+10+10
        assertEquals(expected, Level1Task3.calculateTotal(input));
    }

    @Test
    public void testTotalMarks_MixedGrades() {
        char[] input = {'a', 'b', 'c', 'd', 'e', 'f'};
        int expected = 10+9+8+7+6+0; //40
        assertEquals(expected, Level1Task3.calculateTotal(input));
    }

    @Test
    public void testAverageMarks_AllA() {
        char[] input = {'a', 'a', 'a'};
        int expected = 10; //(30/3)
        assertEquals(expected, Level1Task3.calculateAverage(input));
    }

    @Test
    public void testAverageMarks_MixedGrades() {
        char[] input = {'a', 'b', 'c'};
        int expected = (10 + 9 + 8) / 3; // (27/3)
        assertEquals(expected, Level1Task3.calculateAverage(input));
    }
    @Test
    public void testfailMarks(){
        char[] input={'f','f','f'};
        int exp=(0+0+0)/3; //0
        assertEquals(exp,Level1Task3.calculateAverage(input));
    }
}
