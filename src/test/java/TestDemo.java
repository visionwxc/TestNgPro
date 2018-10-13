import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestDemo {
    @Test
    public void testCase1(){
        Assert.assertTrue(false);
        System.out.println("testcase1");
    }

    @Test
    public void testCase2(){
        Assert.assertTrue(false);
        System.out.println("testcase2");
    }

    @Test
    @Parameters({"a","b"})//多参数传递
    public void testCase3(String a,String b) throws Exception{
        System.out.println("hello "+ a+" "+b);
    }
}
