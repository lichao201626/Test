import java.lang.reflect.Method;

public class HelloTest {
    @Hello("hello world xx")
    public static void main(String[] args) throws Exception{
        Class clazz = HelloTest.class;
        Method m = clazz.getMethod("main", String[].class);
        Hello hello = m.getAnnotation(Hello.class);
        System.out.println(hello.value());
    }
}
