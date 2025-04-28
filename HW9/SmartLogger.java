import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    private int logCount = 1;

    @Override
    public void log(String msg) {
        String s;
        if (msg.contains("error")) {
            s = "ERROR";
        } else {
            s = "INFO";
        }
        System.out.println(s + "#" + logCount + " [" + LocalDateTime.now() + "] " + msg);
        logCount += 1;
    }
}
