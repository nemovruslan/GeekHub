package hw5;

public class FilesLogger implements Logger {

    @Override
    public void log(String msg) {
        System.out.println(msg);
    }

    @Override
    public void error(Throwable e) {
        System.err.println(e.getClass() + "\t" + e.getMessage());
    }

}
