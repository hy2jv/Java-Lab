package tobyspring.config.autoconfig;

import tobyspring.config.MyConfigurationProperties;

@MyConfigurationProperties(prefix = "server")
// prefix는 클래스에 나오는 프로퍼티들에 대한 네임스페이스 역할을 해준다.
// context-path나 port 같은 것들은 다른 기술에서도 사용되어질만한 프로퍼티명이기 때문에 이걸 application.properties 안에 정의를 하다보면
// 중복이 일어날 수 있기 때문에 이것을 구분하기 위해 prefix를 사용하는 것이 좋다.
public class ServerProperties {
    private String contextPath;
    private int port;

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
