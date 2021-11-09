import com.mail.Mail;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author lichao
 */
@Controller
@EnableAutoConfiguration
@EnableScheduling
@SpringBootApplication(scanBasePackages = { "com"})
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/a")
    String home2() {
        return "redirect:index.html";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
//        Mail mail = new Mail();
//        mail.sendMail("824683639@qq.com", "test send java mail");
    }

}