import org.testng.annotations.*;

public class Clasa2 {

    @BeforeGroups("smoke")
    public void setup() {
        System.out.println("Clasa2 - setup");


    }

    @AfterGroups("regression")
    public void tearDown(){
        System.out.println("Clasa2 - tearDown");


    }

    @Test(groups = {"smoke"})
    public void Clasa2Test1() {

    }

    @Test(groups = {"regression"})
    public void Clasa2Test2() {

    }
    @Test(groups = {"regression", "slow"})
    public void Clasa2Test3() {

    }
}
