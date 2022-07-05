import org.testng.annotations.Test;

public class Testng {
    @Test(priority=0)
    public void Test1() {
        System.out.println("I am running Test1");
    }
    @Test(groups = { "Reshu" })
    public void Test2() {
        System.out.println("I am running Test2");
    }
    @Test(enabled=false)
    public void Test3() {
        System.out.println("I am running Test3");
    }
    @Test(groups = { "Reshu" })
    public void Test4() {
        System.out.println("I am running Test4");
    }
    @Test(invocationCount = 10)
    public void Test5() {
        System.out.println("I am running Test5");
    }
    @Test(priority=-1)
    public void Test6() {
        System.out.println("I am running Test6");
    }
}
