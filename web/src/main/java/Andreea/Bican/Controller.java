package Andreea.Bican;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by andre on 12.05.2016.
 */

public class Controller {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Greetings from Spring Boot and Andreea!";
    }
}

