package utils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.IOException;

public class ConfigReader {
    private static JsonObject configData;
    static {
        try {
            FileReader reader = new FileReader("src/test/resources/config.json");
            configData = JsonParser.parseReader(reader).getAsJsonObject();
        } catch (IOException e) {
            throw new RuntimeException("The file config.json couldn't be read", e);
        }
    }
    public static String getUsername() {
        return configData.get("username").getAsString();
    }
    public static String getPassword() {
        return configData.get("password").getAsString();
    }
}
