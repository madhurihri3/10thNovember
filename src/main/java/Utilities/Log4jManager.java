package Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jManager {

    private static boolean isConfigured = false;

    private static void configureLogger() {
        if (!isConfigured) {
            PropertyConfigurator.configure("log4j.properties");
            isConfigured = true;
        }
    }

    public static void info(String message) {
        configureLogger();
        Logger logger = Logger.getLogger(Log4jManager.class);
        logger.info(message);
    }

    public static void error(String message, Throwable throwable) {
        configureLogger();
        Logger logger = Logger.getLogger(Log4jManager.class);
        logger.error(message, throwable);
    }
}

