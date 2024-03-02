package tobyspring.config.autoconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import tobyspring.config.ConditionalMyOnClass;
import tobyspring.config.MyAutoConfiguration;

@MyAutoConfiguration
@ConditionalMyOnClass("org.apache.catalina.startup.Tomcat")
public class TomcatWebServerConfig {
    @Value("${contextPath: }") // default => context-path none(" ")
    String contextPath;

    @Value("${port:8080}") // default 8080
    int port;

    @Bean("tomcatWebServerFactory")
    @ConditionalOnMissingBean // 같은 타입의 빈이 있는지(사용자가 직접 등록한) 체크해보고 없다면, 이걸 빈으로 등록
    public ServletWebServerFactory servletWebServerFactory() {
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
        factory.setContextPath(this.contextPath); // context-path를 지정하면 모든 서블릿의 맵핑 앞에 context-path가 추가됨
        factory.setPort(port);

        return factory;
    }

}
