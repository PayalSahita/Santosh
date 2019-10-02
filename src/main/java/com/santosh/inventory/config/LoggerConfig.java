package com.santosh.inventory.config;

import org.slf4j.Logger;

public class LoggerConfig {

    private LoggerConfig() throws IllegalAccessException{
        throw new IllegalAccessException("Can not create object of this class");
    }

    public static void logInfo(Logger log, String message){
    	if(log.isInfoEnabled()) {
    		log.info(message);
    	}
    }

    public static void logError(Logger log, String message, Exception e){
    	if(log.isErrorEnabled()) {
    		log.error(message,e);
    	}
    }

    public static void logDebug(Logger log, String message){
    	if(log.isDebugEnabled()) {
    		log.debug(message);
    	}
    }
    
    public static void logError(Logger log, String message){
    	if(log.isErrorEnabled()) {
    		log.error(message);
    	}
    }
    
}
