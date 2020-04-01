package configuration;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//odczytywanie właściwości z zadanego pliku properties
public class PropertiesLoader {
    private Logger logger = LogManager.getLogger(PropertiesLoader.class);

    public Properties getPropertiesFromFile(String propertiesFileName) {
        //oddczytujemy plik properties za pomoca inputstream
        InputStream inputStream = null;
        //oibekt Properties przechowuje nam wlasciwosci
        Properties properties = new Properties();
        try {
            logger.info("Trying to load properties with file name:" + propertiesFileName);
            //odczytujemy plik properties i inicjalizujemyobiekt wlasiwosci
            inputStream = getClass().getClassLoader().getResourceAsStream(propertiesFileName);

            //jesli plik nie iestnieje wyrzuci wyjatek FileNotFoundEXCEPTION
            if (inputStream != null) {
                //ładujemy properties w formie InputStream do wlasciwego obiektu typu Properties
                properties.load(inputStream);
                logger.info("Successfully loaded properties for file: " + propertiesFileName);
            } else {
                throw new FileNotFoundException("Property file " + propertiesFileName + " not found in the classpath");
            }

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Cannot load properties due to IOExceprion!");
        } finally {
            //zamykamy inpustream wywyolujac rywatna metode closeResource
            closeResource(inputStream);
        }
        return properties;
    }

    private void closeResource(InputStream inputStream){
        try{
            inputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
