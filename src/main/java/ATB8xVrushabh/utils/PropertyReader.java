package ATB8xVrushabh.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;
import java.util.Properties;

public class PropertyReader {

    public static String readKey(String key) {
        try {

            FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/data.properties");

            Properties p = new Properties();
            p.load(file);
            return p.getProperty(key);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
