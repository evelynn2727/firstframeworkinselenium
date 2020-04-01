package configuration;

public class AppProperties {
    //metoda zwraca property o naziwe app.url wywolujac metode getProperty, na obiekcie zwracanym przez metode getProperties z klasy ConfigurationProperties
    public static String getAllUrl(){
        return ConfigurationProperties.getProperties().getProperty("app.url");
    }
}
