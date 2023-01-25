import java.io.IOException;
import java.util.logging.*;

public class LoggerClass {

    static Logger logger = Logger.getLogger(LoggerClass.class.getName());

    public LoggerClass() {

    }

    public void log(String title) throws IOException {

        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);

        logger.info(title);

    }

}