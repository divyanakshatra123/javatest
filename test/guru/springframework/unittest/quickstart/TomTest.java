package guru.springframework.unittest.quickstart;

import static org.junit.Assert.*;

public class TomTest {
        TomTest tom = null;
    @org.junit.Before
    public void setUp() throws Exception {
        tom = new TomTest();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        tom = null;
    }

    @org.junit.Test
    public void t() {
        //actual
        String expected = "Jerry";
        Tom di  = new Tom();
        String result =  di.T("22");

        //assert
        assertEquals(expected,result);


    }
}