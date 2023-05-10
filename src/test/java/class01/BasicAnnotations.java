package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.SortedMap;

public class BasicAnnotations {

    @Test
    public void firstTest() {
        System.out.println("This is my 1 testcase");
    }

    @Test (groups = "smoke")
    public void secondTest() {
        System.out.println("This is my 2 testcase");
    }

    @Test
    public void thirdTest() {
        System.out.println("This is my 3 testcase");
    }

    @BeforeMethod
    public void beforeMethod (){
        System.out.println("******* I am precondition *******");}

    @AfterMethod
    public void afterMethod (){
        System.out.println("******* I am Postndition *******");}

}
