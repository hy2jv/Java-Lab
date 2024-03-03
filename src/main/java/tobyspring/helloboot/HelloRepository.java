package tobyspring.helloboot;

public interface HelloRepository {
    Hello findHello(String name);

    void increaseCount(String name);

    default int countOf(String name) { // 자바 8부터 지원하는 default method
        Hello hello = findHello(name);
        return hello == null ? 0 : hello.getCount();
    }
}
