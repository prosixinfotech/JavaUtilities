import java.awt.Component;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Arjun
 */

public class Helper {
    
<<<<<<< HEAD
    private static final String dialogTitle="ProsixInfotech.com";
=======
    private static final String dialogTitle="ProsixInfotech";
>>>>>>> issue1
    
    
    public static class MessageHelper{
        public static void showInfoDialog(Component component,String message,String title){
            JOptionPane.showMessageDialog(component, message, (title==null ? dialogTitle : title), JOptionPane.INFORMATION_MESSAGE);
        }
        
        public static void showErrorDialog(Component component,String message,String title){
            JOptionPane.showMessageDialog(component, message, (title==null ? dialogTitle : title), JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static class PropertiesHelper{        
        
        public static Properties getProperties(String file) throws Exception{            
            Properties properties=new Properties();
//            properties.load(new FileInputStream(file));
            properties.load(ClassLoader.getSystemResourceAsStream(file));
            return properties;
        }
    }      
    
    public static void closeCloseable(java.io.Closeable closeable){
        try {
            closeable.close();
        } catch (Exception e) {
            AppLooger.logError(Helper.class, e.getMessage());
        }
    }
    
}
