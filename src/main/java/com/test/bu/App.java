package com.test.bu;

import org.joda.time.DateTime;
import org.joda.time.JodaTimePermission;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        DateTime joda = new DateTime();

        System.out.println("Hour of day - " + joda.getHourOfDay());
        System.out.println("Week of weekyear - " + joda.getWeekOfWeekyear());
    }
}
