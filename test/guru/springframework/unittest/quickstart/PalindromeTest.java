package guru.springframework.unittest.quickstart;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    PalindromeTest palindromeTest =null;

    @Before
    public void setUp() throws Exception {
        palindromeTest = new PalindromeTest();
    }

    @After
    public void tearDown() throws Exception {
        palindromeTest = null;
    }

    @Test
    public void bro() {
        String expected = "its a palindrome";


        Palindrome di = new Palindrome();

        String result = di.bro("454");
        //assert
        assertEquals(expected, result);

    }
    @Test
    public void brobro()
    {
        String exp ="its not a palindrome";
        Palindrome div = new Palindrome();
        String res =div.bro("123");
        assertEquals(exp,res);
    }

    @Test
    public void arr() {
        int exp = 4;

        Palindrome f =new Palindrome();
        int res = f.arr(22);
        assertEquals(exp,res);
        }
    }
