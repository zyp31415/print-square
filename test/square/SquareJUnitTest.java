package square;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Wilson
 */
public class SquareJUnitTest {

    public SquareJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testPrintSquareScenario1() {
        Assert.assertEquals("not equal", "", Square.printSquare(-1).toString());
    }
    @Test
    public void testPrintSquareScenario2() {
        Assert.assertEquals("not equal", "", Square.printSquare(0).toString());
    }
    @Test
    public void testPrintSquareScenario3() {
        Assert.assertEquals("not equal", "#\n", Square.printSquare(1).toString());
    }
    @Test
    public void testPrintSquareScenario4() {
        Assert.assertEquals("not equal", "##\n##\n", Square.printSquare(2).toString());
    }
    @Test
    public void testPrintSquareScenario5() {
        Assert.assertEquals("not equal", "###\n# #\n###\n", Square.printSquare(3).toString());
    }
    
}