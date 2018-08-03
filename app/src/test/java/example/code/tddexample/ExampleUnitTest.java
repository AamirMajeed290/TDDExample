package example.code.tddexample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private SimpleSet simpleSet;

    @Test
    public void simpleSet_ifSimplesetIsEmpty_returnTrue() {

        assertTrue(simpleSet.isEmpty());
    }

    @Before
    public void setUp() throws Exception {

        simpleSet=new SimpleSet();

    }

    @Test
    public void simpleSet_ifSimpleSetIsNotEmpty_returnFalse() {

        simpleSet.addElement(6);
        assertFalse(simpleSet.isEmpty());
    }

    @Test
    public void simpleSet_ifSimpleSetIsNotEmpty_returnCount() {

     simpleSet.addElement(1);
     simpleSet.addElement(2);
     simpleSet.addElement(2);
     assertEquals(3,simpleSet.elementCount());

    }

    @Test
    public void simpleSet_ifSimppleSetContainElement_retrunTrue() {
        simpleSet.addElement(1);
        simpleSet.addElement(2);
        assertTrue(simpleSet.contains(1));
        assertTrue(simpleSet.contains(2));
}

    @Test
    public void simpleSet_ElementRemoved_setDoesNotContainElement() {

        simpleSet.addElement(1);
        simpleSet.addElement(2);
        assertTrue(simpleSet.contains(1));
        simpleSet.removeElement(1);
        assertFalse(simpleSet.contains(1));
    }



    @Test
    public void simpleSet_ElementRemoved_returnNewCount() {

        simpleSet.addElement(1);
        simpleSet.addElement(2);
        assertTrue(simpleSet.contains(1));
        assertEquals(1,simpleSet.elementCount());
        simpleSet.removeElement(1);
        assertFalse(simpleSet.contains(1));
        assertEquals(0,simpleSet.elementCount());
    }

    @Test
    public void simpleSet_ifSimppleSetDoesNotContainElement_retrunTrue() {

        assertFalse(simpleSet.contains(1));

    }


    @Test
    public void simpleSet_idDuplicatedElementAdded_returnFlse() {

        simpleSet.addElement(1);
        assertFalse(simpleSet.addElement(1));


    }
}