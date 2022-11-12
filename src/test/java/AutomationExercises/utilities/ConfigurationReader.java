package AutomationExercises.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties = new Properties();

    // we want to open properties file and load to properties object ONLY ONCE before reading
    // having static block because static runs first
    static {
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);

            // close the file after loading, otherwise it will take from computer memory like scanner
            file.close();
        } catch (IOException e){

        }
    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}

