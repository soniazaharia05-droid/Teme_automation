import org.testng.annotations.*;

public class Clasa3 {

    @BeforeGroups("smoke")
    public void setup() {
        System.out.println("Clasa3 - setup");


    }

    @AfterGroups("regression")
    public void tearDown(){
        System.out.println("Clasa3 - tearDown");


    }

    @Test(groups = {"smoke"})
    public void Clasa3Test1() {

    }

    @Test(groups = {"regression"})
    public void Clasa3Test2() {

    }

    @Test(groups = {"regression", "slow"})
    public void Clasa3Test3() {

    }
}
