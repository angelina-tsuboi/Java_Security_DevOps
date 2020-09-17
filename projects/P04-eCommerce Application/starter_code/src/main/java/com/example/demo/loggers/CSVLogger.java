package com.example.demo.loggers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

import java.time.Instant;

public class CSVLogger {
    public static final Logger log = LogManager.getLogger();
    private static final Marker CSV_MARKER = MarkerManager.getMarker("CSV");

    public CSVLogger() { }

    public void logToCsv(Number userId, String action, String item, Number itemid, String messsage, String status) {
        log.debug(CSV_MARKER, "CSV Logging", Instant.now(), userId, action, item, itemid, messsage, status);
    }
}