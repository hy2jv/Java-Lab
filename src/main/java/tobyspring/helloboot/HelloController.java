package tobyspring.helloboot;

import org.springframework.context.ApplicationContext;
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
        if( name == null || name.trim().isEmpty()) throw new IllegalArgumentException();
        return helloService.sayHello(name);
    }

}
