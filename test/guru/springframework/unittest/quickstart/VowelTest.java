package guru.springframework.unittest.quickstart;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelTest {
    VowelTest vowelTest = null;

    @Before
    public void setUp() throws Exception {
        vowelTest = new VowelTest();
    }

    @After
    public void tearDown() throws Exception {
        vowelTest = null;
    }

    @Test
    public void vow() {
        String expected = "vowel consonant consonant ";
        Vowel v =new Vowel();
        String result = v.vow("abc");
        assertEquals(expected,result);

    }
}