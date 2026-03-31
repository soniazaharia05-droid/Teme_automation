import org.testng.annotations.*;

public class Clasa1 {

    @BeforeGroups("smoke")
    public void setup() {
        System.out.println("Clasa1 - setup");

    }

    @AfterGroups("regression")
    public void tearDown(){
        System.out.println("Clasa1 - tearDown");


    }

    @Test(groups = {"smoke"})
    public void Clasa1Test1() {

    }

    @Test(groups = {"regression"})
    public void Clasa1Test2() {

    }

    @Test(groups = {"regression", "slow"})
    public void Clasa1Test3() {

    }
}


