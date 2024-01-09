package utils;

import java.util.Properties;

/**
 * Singleton utility class for loading configuration properties from a configuration file.
 */
public class ConfigurationFileReader {
    private final Properties properties;
    private static ConfigurationFileReader configurationLoader;

    /**
     * Private constructor to initialize the properties by loading them from the configuration file.
     *
     * @see PropertyLoader
     */
    private ConfigurationFileReader() {
        properties = PropertyLoader.propertyLoader("src/main/resources/configuration.properties");
    }

    /**
     * Gets the instance of the ConfigurationFileReader and check if it has already been assigned.
     *
     * @return The singleton instance of ConfigurationFileReader.
     */
    public static ConfigurationFileReader getInstance() {
        if (configurationLoader == null) {
            configurationLoader = new ConfigurationFileReader();
        } // double check locking
        return configurationLoader;
    }

    public String getBaseUri() {
        String prop = properties.getProperty("BASE_URL");
        if (prop != null) return prop;
        else throw new RuntimeException("property BASE_URL is not specified in the configuration.properties file");
    }

    public String getBrowser() {
        String prop = properties.getProperty("BROWSER");
        if (prop != null) return prop;
        else throw new RuntimeException("property BROWSER is not specified in the configuration.properties file");
    }

    public String getInventoryUri() {
        String prop = properties.getProperty("INVENTORY_URL");
        if (prop != null) return prop;
        else throw new RuntimeException("property INVENTORY_URL is not specified in the configuration.properties file");
    }

    public String getUsername() {
        String prop = properties.getProperty("USERNAME");
        if (prop != null) return prop;
        else throw new RuntimeException("property USERNAME is not specified in the configuration.properties file");
    }

    public String getPassword() {
        String prop = properties.getProperty("PASSWORD");
        if (prop != null) return prop;
        else throw new RuntimeException("property PASSWORD is not specified in the configuration.properties file");
    }


}
