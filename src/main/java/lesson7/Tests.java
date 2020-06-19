package lesson7;

import lesson7.anotation.AfterSuite;
import lesson7.anotation.BeforeSuite;
import lesson7.anotation.Test;

public class Tests {

    @BeforeSuite
    public void prepare() {
        System.out.println("making preparations");
    }

    @Test(priority = Test.Priority.LOWEST)
    public void test1() {
        System.out.println("in test 5");
    }

    @Test(priority = Test.Priority.VERY_LOW)
    public void test2() {
        System.out.println("in test 4");
    }

    @Test(priority = Test.Priority.MAX_PRIORITY)
    public void test3() {
        System.out.println("in test 1");
    }

    @Test(priority = Test.Priority.HIGHEST)
    public void test4() {
        System.out.println("in test 2");
    }

    @Test
    public void test5() {
        System.out.println("in test 3");
    }

    @AfterSuite
    public void cleanUp() {
        System.out.println("making cleanup");
    }





}
