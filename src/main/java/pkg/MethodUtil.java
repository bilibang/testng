package pkg;

public class MethodUtil {
    public static String getMethodName() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        /*
        stacktrace[0].getMethodName() 是 getStackTrace
        stacktrace[1].getMethodName() 是 getMethodName
        stacktrace[2].getMethodName() 是调用 getMethodName 的函数的函数名
         */
        StackTraceElement e = stackTrace[2];
        String methodName = e.getMethodName();
        return methodName;
    }
}
