import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class PallindromeT2Test {
    @Test
    public void testPallin(){
        String inp="Hello";
        Boolean exp=false;
        assertEquals(exp, PallindromeT2.pallindrome(inp));
    }
    @Test
    public void testPallinCase(){
        String inp="Malayalam";
        Boolean exp=false;
        assertEquals(exp, PallindromeT2.pallindrome(inp));
    }
    @Test
    public void testPallinCrt(){
        String inp="malayalam";
        Boolean exp=true;
        assertEquals(exp, PallindromeT2.pallindrome(inp));
    }
}
