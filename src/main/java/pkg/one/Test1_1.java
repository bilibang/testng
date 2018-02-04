package pkg.one;

import org.testng.annotations.Test;
import pkg.MethodUtil;

import java.lang.reflect.Method;

public class Test1_1 {
    @Test(groups = {"G1"})
    private void test1_1_1() {
        System.out.println(MethodUtil.getMethodName());
    }
}
