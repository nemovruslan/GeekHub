package hw5;

public interface Logger {
    void log(String msg);

    void error(Throwable e);
}
