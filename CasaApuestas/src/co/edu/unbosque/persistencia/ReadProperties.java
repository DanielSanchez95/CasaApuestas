package co.edu.unbosque.persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {

	private Properties properties = new Properties();
	
	// This method is used to load the properties file
	  private void loadPropertiesFile(){
	    InputStream iStream = null;
	      try {
	        // Loading properties file from the path (relative path given here)
	        iStream = new FileInputStream(new File("resources/config.properties"));   
	        properties.load(iStream);
	      } catch (IOException e) {
	       // TODO Auto-generated catch block
	       e.printStackTrace();
	      }finally {
	        try {
	          if(iStream != null){
	            iStream.close();
	          }
	        } catch (IOException e) {
	          // TODO Auto-generated catch block
	          e.printStackTrace();
	        }
	      }
	    }
	  
	  /**
	  * Method to read the properties from a
	  * loaded property file
	  */
	  public String readProperties(String propety){
		  this.loadPropertiesFile();
	    return properties.getProperty(propety);
	  }
}
