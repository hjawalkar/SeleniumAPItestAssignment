package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*Blaze demo browser automation
 * Created script by Hanumanth 
 * Date:06-10-2021
 */
public class ConfigReader {

    private static final Properties properties;

    static {
        properties = new Properties();

        try{
            properties.load(new FileInputStream(new File("./src/test/resources/properties/config.properties")));
            properties.load(
                    new FileInputStream(new File("./src/test/resources/properties/testdatapath.properties")));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String get(String name){
        return get(name, null);
    }

    public static String get(String name, String defaultValue){
        return properties.getProperty(name, defaultValue);
    }
}
