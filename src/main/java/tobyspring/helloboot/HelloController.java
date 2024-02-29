package tobyspring.helloboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Rest 방식을 이용하여 HTML을 통째로 리턴하는 대신에 API 요청에 대한 응답을 바디에 특정한 타입으로 인코딩해서 보내는 컨트롤러를 만들 때 사용하는 방식
public class HelloController {
    @GetMapping("/hello") // 웹의 요청에 http 메소드가 get으로 되어 있는 것만 받겠다는 것
    public String hello(String name) {
        return "Hello " + name;
    }
}
