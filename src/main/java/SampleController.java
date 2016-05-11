/**
 * Created by andre on 10.05.2016.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
@EnableAutoConfiguration
public class SampleController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/")
    @ResponseBody
    String home() {
            return "Greetings from Spring Boot and Andreea!";
    }

    @RequestMapping("/greeting")
    @ResponseBody
    public Greeting hello(@RequestParam(value="username", defaultValue = "Annonymous") String name)
    {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    public static void main(String[] args) throws Exception {
        System.out.println("HI!");
        SpringApplication.run(SampleController.class, args);
    }
}