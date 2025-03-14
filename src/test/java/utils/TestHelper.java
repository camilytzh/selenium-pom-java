package utils;

import java.util.UUID;

public class TestHelper {
    public static String generateRandomUsername() {
        return "test_" + UUID.randomUUID().toString().substring(0, 8);
    }
    public static String generateRandomPassword() {
        return "test_pass" + UUID.randomUUID().toString().substring(0, 8);
    }
}
