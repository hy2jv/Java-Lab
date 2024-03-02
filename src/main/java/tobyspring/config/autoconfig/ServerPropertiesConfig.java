package tobyspring.config.autoconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import tobyspring.config.MyAutoConfiguration;

import java.util.Objects;

@MyAutoConfiguration
public class ServerPropertiesConfig {
    @Bean
    public ServerProperties serverProperties(Environment environment) {
        ServerProperties properties = new ServerProperties();

        properties.setContextPath(environment.getProperty("contextPath"));
        properties.setPort(Integer.parseInt(Objects.requireNonNull(environment.getProperty("port"))));

        return properties;
    }
}
