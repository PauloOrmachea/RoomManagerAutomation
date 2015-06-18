package roomManager.util;

import org.apache.log4j.Logger;

public class Logs {
      
      static Logger log = Logger.getLogger(Logs.class.getName());
      
      public static void info(String message){
               log.info(message);
      }
}
