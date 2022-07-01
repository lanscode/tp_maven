package com.mycompany.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	public static final Logger LOGGER = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        LOGGER.info( "Hello World!" );
        LOGGER.info("ceci est un message de test");
    }
}
