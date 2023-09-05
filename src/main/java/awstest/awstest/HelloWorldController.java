package awstest.awstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String helloWorld() {
        return "hello ";
    }

    @GetMapping("/test")
    public String test() {
        return "test ";
    }
}
