package es.egc.app;
import org.apache.log4j.*; 

/**
 * Hello world!
 *
 */


public class App 
{

static Logger log=Logger.getLogger(App.class); 
    
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
	log.info("Returning 1");	
    }
}
