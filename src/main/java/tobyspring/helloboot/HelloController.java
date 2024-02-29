package tobyspring.helloboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController // "@Controller"와 "@Response Body"를 "meta annotation"으로 가지고 있음
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String hello(String name) {

        return helloService.sayHello(Objects.requireNonNull(name));
    }
}
