import lesson6.Lesson6;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Tests {

    Lesson6 lesson6;

    @Before
    public void prepare() {
        lesson6 = new Lesson6();
    }

    //Тесты копирования после значения 4
    //__________________________________
    @Test
    public void passTestForFourRightArray() {
        int[] data = {1,5,1,2,4,2,3,2,3,2};
        Assert.assertArrayEquals(new int[]{2,3,2,3,2},lesson6.arrayCopyFour(data));
    }

    @Test(expected = RuntimeException.class)
    public void dontPassTestRuntimeExc() {
        int[] data = {1,5,1,2,2,3,2,3,2};
        lesson6.arrayCopyFour(data);
    }

    @Test
    public void testWithEmptyArray() {
        int[] data = {4,4,4,4,4,4,4,4,4};
        Assert.assertArrayEquals(new int[]{}, lesson6.arrayCopyFour(data));
    }


    //Тесты вхождения 1 и 4 в массив
    //______________________________
    @Test
    public void passArrayOneFour() {
        int[] data = {4,1,4,1,1,1,1,4,1};
        if(lesson6.arrayContainsOneFour(data)) {
            System.out.println(true);
            Assert.assertTrue(true);
        } else {
            System.out.println(false);
            Assert.assertFalse(false);
        }
    }

    @Test
    public void dontPassArrayOneFour() {
        int[] data = {4,4,4,4,4,4,4,4};
        if(lesson6.arrayContainsOneFour(data)) {
            System.out.println(true);
            Assert.assertTrue(true);
        } else {
            System.out.println(false);
            Assert.assertFalse(false);
        }
    }

    @Test
    public void testArrayOneFourWithEmptyArray() {
        int[] data = {};
        if(lesson6.arrayContainsOneFour(data)) {
            System.out.println(true);
            Assert.assertTrue(true);
        } else {
            System.out.println(false);
            Assert.assertFalse(false);
        }
    }


}
