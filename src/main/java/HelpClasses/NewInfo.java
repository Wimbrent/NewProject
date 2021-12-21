package HelpClasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class NewInfo {
    protected static FileInputStream fileInputStream;
    protected static Properties PROPERTIES;

    static {
        try {
            // Path to file
            fileInputStream = new FileInputStream("src/main/resources/NewInformation");
            PROPERTIES = new Properties();
            PROPERTIES.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
            // обработка возможного исключения (нет файла и т.д.)
        } finally {
            if (fileInputStream != null)
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }
}
