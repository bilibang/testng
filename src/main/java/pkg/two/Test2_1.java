package pkg.two;

import org.testng.annotations.Test;
import pkg.MethodUtil;

@Test(groups = {"G1"})
public class Test2_1 {
    public void test2_1_1() {
        System.out.println(MethodUtil.getMethodName());
    }
}
