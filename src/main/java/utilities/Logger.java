package utilities;

import org.apache.logging.log4j.LogManager;

public class Logger {
    public static Logger getLogger(Class<?> cls)
    {
        return (Logger) LogManager.getLogger(cls);
    }

}
