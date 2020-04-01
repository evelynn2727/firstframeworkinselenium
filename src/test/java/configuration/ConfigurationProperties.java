package configuration;

import java.util.Properties;

public class ConfigurationProperties {
    //statyczne ole do przechowywania properties
    private static Properties properties;

    //prywatny konstruktor dla tylko jednej instancji tejze klasy
    private ConfigurationProperties(){}

    //metoda sluzy do zaladowania obiektu properties do statyczneg otypu Propertiees, dostepnego dla wszystkich watkow
    public static void setProperties(Properties properties){
        ConfigurationProperties.properties=properties;
    }

    //metoda zwraca nam wszystkie zaladowane properties, jesli nie sa one nullem
    public static Properties getProperties(){
        if (properties==null){
            throw new IllegalStateException("Please set properties using setProperties() before calling getProperties()");
        }
        return properties;
    }
}
