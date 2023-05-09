package class01;

import org.testng.annotations.Test;

public class Priority1 {

    //change priority
    @Test (priority = 2)
    public void firstTest(){
        System.out.println("1st");
    }


    @Test (priority = 3)
    public void secondTest(){
        System.out.println("2nd");
    }


    @Test (priority = 1, enabled = true)
    public void thirdTest(){
        System.out.println("3rd");
    }

    //change enable status
    @Test (enabled = false)
    public void forthTest(){
        System.out.println("4rd");
    }


    @Test (enabled = true)
    public void fifthTest(){
        System.out.println("3/0");
    }


    //ignored if error depends method
    @Test (dependsOnMethods = "fifthTest")
    public void sixTest(){
        System.out.println("6rd");
    }
}
