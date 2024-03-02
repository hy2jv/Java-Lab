package tobyspring.helloboot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import tobyspring.config.MySpringBootApplication;

@MySpringBootApplication
public class HellobootApplication {

	// Properties 파일보다 환경 변수를 우선시하여 property로 읽힌다.
	// 추가적으로 환경 변수보다는 시스템 property가 더 우선된다.
	@Bean
	ApplicationRunner applicationRunner(Environment env) {
		return args -> {
			String name = env.getProperty("my.name");
			System.out.println("my.name: " + name);
		};
    }

    public static void main(String[] args) {
		SpringApplication.run(HellobootApplication.class, args);
	}

}
