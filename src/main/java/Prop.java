import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

public class Prop {
    public static void main(String[] args) throws Exception{
        Map<String, String> s = System.getenv();
        Properties ps = System.getProperties();
        System.out.println("finish");

        Properties properties = new Properties();
       // InputStream in = new BufferedInputStream("E:\\workspace\\Test\\src\\main\\java\\a.properties");
       // BufferedReader in = new BufferedReader(new FileReader("E:\\workspace\\Test\\src\\main\\java\\a.properties"));
       InputStream in = Prop.class.getClassLoader().getResourceAsStream("conf/a.properties");
        properties.load(in);
        System.out.println(properties.getProperty("age"));
    }
}
