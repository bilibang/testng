package pkg.one;

import org.testng.annotations.Test;
import pkg.MethodUtil;

public class Test1_2 {
    @Test(groups = {"G2"})
    public void test1_2_1() {
        System.out.println(MethodUtil.getMethodName());
    }
}
